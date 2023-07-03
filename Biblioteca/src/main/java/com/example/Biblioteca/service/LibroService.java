package com.example.Biblioteca.service;

import com.example.Biblioteca.entities.LibroEntity;
import com.example.Biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<LibroEntity> getAllLibro(){return libroRepository.findAll();}

    public Optional<LibroEntity> getLibroById(@PathVariable Long id){return libroRepository.findById(id);}

    public void deleteLibroById(@PathVariable Long id){libroRepository.deleteById(id);}

}







