package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "journal_entries")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Journal_entries {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String journal_id;
    private String account_id;
    private String debit;
    private String credit;
    private String description;



}
