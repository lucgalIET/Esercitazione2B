package com.example.Biblioteca.repository;

import com.example.Biblioteca.entities.EditoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoreRepository  extends JpaRepository<EditoreEntity,Long> {

}
