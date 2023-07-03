package com.example.Biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name ="libro")
public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id",nullable = false)
    private Long idLibro;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "pagine")
    private int pagine;

    @Column(name = "prezzo")
    private double prezzo;


}
