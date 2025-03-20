package com.jhon.controlecontas.frontend.repository;

import com.jhon.controlecontas.frontend.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    List<Conta> findByUserId(Long userId);
}
