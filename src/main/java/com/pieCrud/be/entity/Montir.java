package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "montir")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Montir {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String nama;
    private String pengalaman;



}
