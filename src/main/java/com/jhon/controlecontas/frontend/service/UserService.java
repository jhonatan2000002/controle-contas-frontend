package com.jhon.controlecontas.frontend.service;

import com.jhon.controlecontas.frontend.model.Usuario;
import com.jhon.controlecontas.frontend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Usuario> findAll() {
        return userRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<Usuario> findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public Usuario save(Usuario user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
