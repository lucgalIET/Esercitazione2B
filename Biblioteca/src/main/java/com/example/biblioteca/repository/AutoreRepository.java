package com.example.biblioteca.repository;

import com.example.biblioteca.entities.AutoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository  extends JpaRepository<AutoreEntity,Long> {
}
