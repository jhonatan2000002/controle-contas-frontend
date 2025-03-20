package com.jhon.controlecontas.frontend.repository;

import com.jhon.controlecontas.frontend.model.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, Long> {
    List<Parcela> findByContaId(Long contaId);
}
