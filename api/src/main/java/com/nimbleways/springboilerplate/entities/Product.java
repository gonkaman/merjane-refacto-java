package com.nimbleways.springboilerplate.entities;

import lombok.*;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lead_time")
    private Integer leadTime;

    @Column(name = "available")
    private Integer available;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "season_start_date")
    private LocalDate seasonStartDate;

    @Column(name = "season_end_date")
    private LocalDate seasonEndDate;

    @Column(name = "flashsale_start_date")
    private LocalDate flashSaleStartDate;

    @Column(name = "flashsale_end_date")
    private LocalDate flashSaleEndDate;

    @Column(name = "flashsale_consumed")
    private Integer flashSaleConsumed;

    @Column(name = "flashsale_max_quantity")
    private Integer flashSaleMaxQuantity;
}
