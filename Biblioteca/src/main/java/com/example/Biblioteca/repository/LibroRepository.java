package com.example.Biblioteca.repository;

import com.example.Biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long> {
}

