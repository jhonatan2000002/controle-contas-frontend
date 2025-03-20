package com.jhon.controlecontas.frontend.service;

import com.jhon.controlecontas.frontend.model.Conta;
import com.jhon.controlecontas.frontend.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }

    public Optional<Conta> findById(Long id) {
        return contaRepository.findById(id);
    }

    public List<Conta> findByUserId(Long userId) {
        return contaRepository.findByUserId(userId);
    }

    public Conta save(Conta conta) {
        return contaRepository.save(conta);
    }

    public void delete(Long id) {
        contaRepository.deleteById(id);
    }
}
