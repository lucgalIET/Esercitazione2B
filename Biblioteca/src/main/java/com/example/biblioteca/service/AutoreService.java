package com.example.biblioteca.service;

import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;


    public AutoreEntity saveAutore(AutoreEntity autore) {
        return autoreRepository.save(autore);
    }

    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }

    public Optional<AutoreEntity> getAutoreById(Long id) {
        return autoreRepository.findById(id);
    }

    public AutoreEntity updateEditore(AutoreEntity autore) {

        Optional<AutoreEntity> autoreEntity = getAutoreById(autore.getIdAutore());
        if (autoreEntity.isEmpty()) throw new NullPointerException();

        return autoreRepository.save(autore);
    }
    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }}