package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "journals")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Journals {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String reference_no;
    private String description;
    private String date;
    private String created_at;
    private String updated_at;



}
