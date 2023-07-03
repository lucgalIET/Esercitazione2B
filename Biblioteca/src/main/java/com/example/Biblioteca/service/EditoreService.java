package com.example.Biblioteca.service;

import com.example.Biblioteca.entities.EditoreEntity;
import com.example.Biblioteca.repository.EditoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoreService {
    @Autowired
    private EditoreRepository editoreRepository;


    public EditoreEntity saveEditore(EditoreEntity editore) {
        return editoreRepository.save(editore);
    }

    public List<EditoreEntity> getAllEditori() {
        return editoreRepository.findAll();
    }

    public Optional<EditoreEntity> getEditoreById(Long id) {
        return editoreRepository.findById(id);
    }

    public EditoreEntity updateEditore(EditoreEntity editore) {

        Optional<EditoreEntity> editoreEntity = getEditoreById(editore.getIdEditore());
        if (editoreEntity.isEmpty()) throw new NullPointerException();

        return editoreRepository.save(editore);
    }
    public void deleteEditore(Long id) {
        editoreRepository.deleteById(id);
    }}