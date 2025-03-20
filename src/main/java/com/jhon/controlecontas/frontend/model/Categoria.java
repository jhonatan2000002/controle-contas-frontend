package com.jhon.controlecontas.frontend.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Categoria {
    @Id

    private Long id;
    private String descricao;
    private String tipo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Conta> contas;

    // Getters e Setters
}