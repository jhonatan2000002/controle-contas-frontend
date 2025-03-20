package com.jhon.controlecontas.frontend.service;

import com.jhon.controlecontas.frontend.model.Parcela;
import com.jhon.controlecontas.frontend.repository.ParcelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParcelaService {

    @Autowired
    private ParcelaRepository parcelaRepository;

    public List<Parcela> findAll() {
        return parcelaRepository.findAll();
    }

    public Optional<Parcela> findById(Long id) {
        return parcelaRepository.findById(id);
    }

    public List<Parcela> findByContaId(Long contaId) {
        return parcelaRepository.findByContaId(contaId);
    }

    public Parcela save(Parcela parcela) {
        return parcelaRepository.save(parcela);
    }

    public void delete(Long id) {
        parcelaRepository.deleteById(id);
    }
}
