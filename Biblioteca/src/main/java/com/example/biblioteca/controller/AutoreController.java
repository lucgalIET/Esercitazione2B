package com.example.biblioteca.controller;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    @GetMapping("/get/all")
    public List<AutoreEntity> getAllAutore() {
        return autoreService.getAllAutore();
    }

    @GetMapping("/get/DTO/all")
    public List<AutoreDTO> getAllAutoreDTO(){return autoreService.getAllAutoreDTO();}

    @GetMapping("/get/{id}")
    public Optional<AutoreEntity> getAutoreById(@PathVariable Long id) {
        return autoreService.getAutoreById(id);
    }

    @GetMapping("/get/DTO/{id}")
    public Optional<AutoreDTO> getAutoreByIdDTO(@PathVariable Long id){return autoreService.getAutoreByIdDTO(id);}
    @PostMapping("/save")
    public AutoreEntity saveAutore(@RequestBody AutoreEntity autore) {
        return autoreService.saveAutore(autore);
    }

    @PostMapping("/modifica/{id}")
    public AutoreEntity updateAutore(@RequestBody AutoreEntity autore) {
        return autoreService.saveAutore(autore);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAutore(@PathVariable Long id) {
        autoreService.deleteAutore(id);
    }

    @DeleteMapping("/delete/DTO/{id}")
    public void deleteAutoreDTO(@PathVariable Long id){autoreService.deleteAutoreDTO(id);}
    @GetMapping("/info")
    public List<AutoreDTO> getAutoreInfo() {
        return autoreService.getAutoreInfo();
    }
}
