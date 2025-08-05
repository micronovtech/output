package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customers {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String name;
    private String phone;
    private String address;



}
