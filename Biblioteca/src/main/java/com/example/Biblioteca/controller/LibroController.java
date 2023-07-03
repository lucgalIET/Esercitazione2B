package com.example.Biblioteca.controller;

import com.example.Biblioteca.entities.LibroEntity;
import com.example.Biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/all")
    public List<LibroEntity> getAllLibro(){return libroService.getAllLibro();}

    @GetMapping("/{id}")
    public Optional<LibroEntity>getlibroById(@PathVariable Long id){return libroService.getLibroById(id);}

    @DeleteMapping("/{id}")
    public void deleteLibroById(@PathVariable Long id){libroService.deleteLibroById(id);}



}




