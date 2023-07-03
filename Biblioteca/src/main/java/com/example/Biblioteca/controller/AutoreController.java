package com.example.Biblioteca.controller;

import com.example.Biblioteca.entities.AutoreEntity;
import com.example.Biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;
    @GetMapping("/autore/get-all")
    public List<AutoreEntity> getAllAutore(){
        return autoreService.getAllAutore();
    }
    @GetMapping("/get-autore/{id}")
    public Optional<AutoreEntity> getAutoreById(@PathVariable Long id){
        return autoreService.getAutoreById(id);
    }

    @PostMapping("/salva-autore")
    public AutoreEntity saveAutore(@RequestBody AutoreEntity autore) {return autoreService.saveAutore(autore);}

    @PostMapping("/autore/modifica-autore/{id}")
    public AutoreEntity updateAutore(@RequestBody AutoreEntity autore) {return autoreService.saveAutore(autore);}

    @PostMapping("/autore/delete-autore/{id}")
    public void deleteAutore(@RequestBody Long id) { autoreService.deleteAutore(id);}


}
