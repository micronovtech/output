package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transactions {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String transaction_date;
    private String amount;
    private String type;
    private String description;
    private String journal_id;
    private String created_at;



}
