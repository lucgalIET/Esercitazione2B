package com.example.Biblioteca.repository;

import com.example.Biblioteca.entities.EditoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EditoreRepository  extends JpaRepository<EditoreEntity,Long> {
    @Query(value = "SELECT nome, contatto FROM editore", nativeQuery = true )
    List<String> getStudenteNomeContatto();
}
