package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "motor")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Motor {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String merk;
    private String model;
    private String tahun;



}
