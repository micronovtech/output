package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Products {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String name;
    private String price;
    private String stock;
    private String Photo;



}
