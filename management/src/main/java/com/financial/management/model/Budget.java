package com.financial.management;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "budgets")
@Getter @Setter
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private Double limitAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}