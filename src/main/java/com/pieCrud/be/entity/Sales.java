package com.pieCrud.be.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "sales")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sales {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String quantity;
    private String total_price;
    private String date;
    private String Struk;

        @ManyToOne
        @JoinColumn(name = "product_id")
        private Products product_id;
        @ManyToOne
        @JoinColumn(name = "customer_id")
        private Customers customer_id;


}
