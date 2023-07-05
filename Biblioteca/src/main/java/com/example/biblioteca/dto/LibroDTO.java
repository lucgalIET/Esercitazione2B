package com.example.biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibroDTO {
    private Long idLibro;
    private String titolo;
    private int pagine;
    private double prezzo;
}
