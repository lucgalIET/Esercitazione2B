package com.example.Biblioteca.controller;


import com.example.Biblioteca.entities.EditoreEntity;
import com.example.Biblioteca.service.EditoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autore")
public class EditoreController {
    @Autowired
    private EditoreService editoreService;
    @GetMapping("/autore/get-all")
    public List<EditoreEntity> getAllEditore(){
        return editoreService.getAllEditore();
    }
    @GetMapping("/get-autore/{id}")
    public Optional<EditoreEntity> getEditoreById(@PathVariable Long id){
        return editoreService.getEditoreById(id);
    }

    @PostMapping("/salva-autore")
    public EditoreEntity saveEditore(@RequestBody EditoreEntity editore) {return editoreService.saveEditore(editore);}

    @PostMapping("/modifica-editore/{id}")
    public EditoreEntity updateEditore(@RequestBody EditoreEntity editore) {return editoreService.saveEditore(editore);}

    @DeleteMapping("/{id}")
    public void deleteEditore(Long id){
        editoreService.deleteEditore(id);
    }


}
