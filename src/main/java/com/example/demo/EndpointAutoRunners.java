package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class EndpointAutoRunners implements CommandLineRunner {

private final ApplicationContext context;
private final RestTemplate restTemplate;

@Value("${server.port:8080}")
private int serverPort;

public EndpointAutoRunners(ApplicationContext context, RestTemplate restTemplate) {
this.context = context;
this.restTemplate = restTemplate;
}

@Override
public void run(String... args) {
Map<String, Object> controllers = context.getBeansWithAnnotation(RestController.class);
for (Object controller : controllers.values()) {
Class<?> clazz = AopUtils.getTargetClass(controller);

for (Method method : clazz.getDeclaredMethods()) {
RequestMapping methodMapping = AnnotatedElementUtils.findMergedAnnotation(method, RequestMapping.class);
if (methodMapping != null) {
String httpMethod = methodMapping.method().length > 0 ? methodMapping.method()[0].name() : "GET";
String[] paths = methodMapping.path().length > 0 ? methodMapping.path() : methodMapping.value();

for (String path : paths) {
String fullPath = buildFullUrl(clazz, path);
callEndpoint(httpMethod, fullPath);
}
}
}
}
}

private String buildFullUrl(Class<?> controllerClass, String methodPath) {
RequestMapping classMapping = AnnotatedElementUtils.findMergedAnnotation(controllerClass, RequestMapping.class);
String classPath = classMapping != null && classMapping.path().length > 0 ? classMapping.path()[0] : "";
return "http://localhost:" + serverPort + classPath + methodPath;
}


private void callEndpoint(String method, String url) {
    try {
        switch (method) {
            case "GET" -> {
                ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
                log.info("[GET {}] -> {}", url, response.getStatusCode());
            }
            case "POST" -> {
                Map<String, Object> dummy = new HashMap<>();
                dummy.put("name", "test");
                ResponseEntity<String> response = restTemplate.postForEntity(url, dummy, String.class);
                log.info("[POST {}] -> {}", url, response.getStatusCode());
            }
            case "PUT" -> {
                Map<String, Object> dummy = new HashMap<>();
                dummy.put("name", "updated");
                restTemplate.put(url.replace("{id}", "1"), dummy);
                log.info("[PUT {}] -> OK", url);
            }
            case "DELETE" -> {
                restTemplate.delete(url.replace("{id}", "1"));
                log.info("[DELETE {}] -> OK", url);
            }
            default -> log.warn("Unsupported HTTP Method: {}", method);
        }
    } catch (Exception e) {
        log.warn("[{} {}] -> ERROR: {}", method, url, e.getMessage());
    }
}

}
