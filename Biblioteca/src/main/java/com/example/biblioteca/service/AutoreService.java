package com.example.biblioteca.service;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.mapper.AutoreMapper;
import com.example.biblioteca.mapper.LibroMapper;
import com.example.biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;


    public AutoreEntity saveAutore(AutoreEntity autore) {
        return autoreRepository.save(autore);
    }

    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }

    public Optional<AutoreEntity> getAutoreById(Long id) {
        return autoreRepository.findById(id);
    }

    public AutoreEntity updateEditore(AutoreEntity autore) {

        Optional<AutoreEntity> autoreEntity = getAutoreById(autore.getIdAutore());
        if (autoreEntity.isEmpty()) throw new NullPointerException();

        return autoreRepository.save(autore);
    }

    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }



    public List<AutoreDTO> getAutoreInfo() {
        List<AutoreEntity> autoreEntityList = autoreRepository.getAutoreInfo();
        List<AutoreDTO> autoreDTOList = new ArrayList<>();
        for (int i = 0; i < autoreEntityList.size(); i++) {
            autoreDTOList.add(AutoreMapper.AUTORE_MAPPER.entityToDto(autoreEntityList.get(i)));
        }
        return autoreDTOList;}


}


