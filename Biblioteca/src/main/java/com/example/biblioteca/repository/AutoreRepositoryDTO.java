package com.example.biblioteca.repository;

import com.example.biblioteca.dto.AutoreDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepositoryDTO extends JpaRepository<AutoreDTO,Long> {
}
