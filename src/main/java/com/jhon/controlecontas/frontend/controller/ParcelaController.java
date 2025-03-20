package com.jhon.controlecontas.frontend.controller;

import com.jhon.controlecontas.frontend.model.Parcela;
import com.jhon.controlecontas.frontend.service.ParcelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parcelas")
public class ParcelaController {

    @Autowired
    private ParcelaService parcelaService;

    @GetMapping
    public List<Parcela> findAll() {
        return parcelaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parcela> findById(@PathVariable Long id) {
        Optional<Parcela> parcela = parcelaService.findById(id);
        return parcela.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Parcela save(@RequestBody Parcela parcela) {
        return parcelaService.save(parcela);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        parcelaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
