package com.example.biblioteca.service;

import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.mapper.LibroMapper;
import com.example.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
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

    public LibroDTO updateLibro(LibroEntity libro) {
        Optional<LibroEntity> libroEntity = getLibroById(libro.getIdLibro());
        if (libroEntity.isEmpty()) throw new NullPointerException();

        return LibroMapper.LIBRO_MAPPER.entityToDto(libroRepository.save(libro));
    }

    public LibroDTO saveLibro(LibroEntity libro) {

        return LibroMapper.LIBRO_MAPPER.entityToDto(libroRepository.save(libro));
    }

    public List<LibroDTO> libriConPiuDi400Pagine() {
        List<LibroEntity> libroEntityList = libroRepository.libriConPiuDi400Pagine();
        List<LibroDTO> libroDTOList = new ArrayList<>();
        for (int i = 0; i < libroEntityList.size(); i++) {
            libroDTOList.add(LibroMapper.LIBRO_MAPPER.entityToDto(libroEntityList.get(i)));
        }
        return libroDTOList;
    }

    public List<LibroDTO> getLibroInfo() {
        List<LibroEntity> libroEntityList = libroRepository.getLibroInfo();
        List<LibroDTO> libroDTOList = new ArrayList<>();
        for (int i = 0; i < libroEntityList.size(); i++) {
            libroDTOList.add(LibroMapper.LIBRO_MAPPER.entityToDto(libroEntityList.get(i)));
        }
        return libroDTOList;
    }
    //implementare un metodo che all'inserimento di un autore e di un libro aggiorni la tabella di relazione autore-libro
}










