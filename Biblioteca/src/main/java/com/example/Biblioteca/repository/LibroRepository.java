package com.example.Biblioteca.repository;

import com.example.Biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long> {

    @Query(value = "SELECT l.titolo,l.pagine,l.prezzo" +
            "FROM libro l" +
            "WHERE pagine>400", nativeQuery = true)
    List<LibroEntity> libriConPiuDi400Pagine();


}
