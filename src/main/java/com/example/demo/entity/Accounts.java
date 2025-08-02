package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "accountss")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Accounts {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String code;
    private String name;
    private String type;
    private String created_at;
    private String updated_at;



}
