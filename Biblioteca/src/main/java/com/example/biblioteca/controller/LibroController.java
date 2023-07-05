package com.example.biblioteca.controller;

import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/get/all")
    public List<LibroEntity> getAllLibro(){return libroService.getAllLibro();}

    @GetMapping("/get/{id}")
    public Optional<LibroEntity>getlibroById(@PathVariable Long id){return libroService.getLibroById(id);}

    @DeleteMapping("/delete/{id}")
    public void deleteLibroById(@PathVariable Long id){libroService.deleteLibroById(id);}


    @PostMapping("/save")
    public LibroEntity saveLibro(@RequestBody LibroEntity libro) {return libroService.saveLibro(libro);}

    @PostMapping("/edit/{id}")
    public LibroEntity updateLibro(@RequestBody LibroEntity libro) {return libroService.saveLibro(libro);}

    @GetMapping("/libriConPiuDi400Pagine")
    public List<LibroEntity> libriConPiuDi400Pagine(){return libroService.libriConPiuDi400Pagine();}


}




