package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "penjualan")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Penjualan {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String tanggal;

        @ManyToOne
        @JoinColumn(name = "motor_id")
        private Motor motor_id;
        @ManyToOne
        @JoinColumn(name = "customer_id")
        private Customer customer_id;


}
