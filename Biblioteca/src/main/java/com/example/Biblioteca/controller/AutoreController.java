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
    @GetMapping("/get-all")
    public List<AutoreEntity> getAllAutore(){
        return autoreService.getAllAutore();
    }
    @GetMapping("/get/{id}")
    public Optional<AutoreEntity> getAutoreById(@PathVariable Long id){
        return autoreService.getAutoreById(id);
    }

    @PostMapping("/save")
    public AutoreEntity saveAutore(@RequestBody AutoreEntity autore) {return autoreService.saveAutore(autore);}

    @PostMapping("/modifica/{id}")
    public AutoreEntity updateAutore(@RequestBody AutoreEntity autore) {return autoreService.saveAutore(autore);}

    @DeleteMapping("/delete/{id}")
    public void deleteAutore(Long id){
        autoreService.deleteAutore(id);
    }


}
