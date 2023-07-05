package com.example.biblioteca.service;

import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<LibroEntity> getAllLibro() {
        return libroRepository.findAll();
    }

    public Optional<LibroEntity> getLibroById(@PathVariable Long id) {
        return libroRepository.findById(id);
    }

    public void deleteLibroById(@PathVariable Long id) {
        libroRepository.deleteById(id);
    }

    public LibroEntity updateLibro(LibroEntity libro) {
    Optional<LibroEntity>libroEntity = getLibroById(libro.getIdLibro());
    if (libroEntity.isEmpty()) throw new NullPointerException();

    return libroRepository.save(libro);
    }
    public LibroEntity saveLibro(LibroEntity libro){
        return libroRepository.save(libro);
    }

    public List<LibroEntity>libriConPiuDi400Pagine(){return libroRepository.libriConPiuDi400Pagine();}

}










