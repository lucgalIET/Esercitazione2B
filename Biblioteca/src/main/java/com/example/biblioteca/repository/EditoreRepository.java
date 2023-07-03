package com.example.biblioteca.repository;

import com.example.biblioteca.entities.EditoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditoreRepository  extends JpaRepository<EditoreEntity,Long> {

    @Query(value = "SELECT nome, contatto FROM editore", nativeQuery = true )
    List<String> getStudenteNomeContatto();

}
