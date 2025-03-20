package com.jhon.controlecontas.frontend.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Parcela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataVencimento;
    private Integer numeroParcela;
    private Double valorParcela;
    private String status;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;

    // Getters e Setters
}
