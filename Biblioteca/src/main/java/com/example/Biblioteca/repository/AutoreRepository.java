package com.example.Biblioteca.repository;

import com.example.Biblioteca.entities.AutoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository  extends JpaRepository<AutoreEntity,Long> {
}
