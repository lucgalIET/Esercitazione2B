package com.example.biblioteca.controller;


import com.example.biblioteca.entities.EditoreEntity;
import com.example.biblioteca.service.EditoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editore")
public class EditoreController {
    @Autowired
    private EditoreService editoreService;
    @GetMapping("/get/all")
    public List<EditoreEntity> getAllEditore(){
        return editoreService.getAllEditore();
    }
    @GetMapping("/get/{id}")
    public Optional<EditoreEntity> getEditoreById(@PathVariable Long id){
        return editoreService.getEditoreById(id);
    }

    @PostMapping("/save")
    public EditoreEntity saveEditore(@RequestBody EditoreEntity editore) {return editoreService.saveEditore(editore);}

    @PostMapping("/edit/{id}")
    public EditoreEntity updateEditore(@RequestBody EditoreEntity editore) {return editoreService.saveEditore(editore);}

    @DeleteMapping("/delete/{id}")
    public void deleteEditore(Long id){
        editoreService.deleteEditore(id);
    }

    @GetMapping("/editore-nome-contatto")
    public List<String> getStudentiNomeContatto(){
        return editoreService.getStudenteNomeContatto();
    }
}
