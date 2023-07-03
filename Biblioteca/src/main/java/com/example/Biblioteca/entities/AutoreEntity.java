package com.example.Biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "autore")
public class AutoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idAutore;

    @Column(name = "nome")
    private String nomeAutore;

    @Column(name = "nazionalita")
    private String nazionalita;

    public AutoreEntity() {
    }

    public AutoreEntity(Long idAutore, String nomeAutore, String nazionalita) {
        this.idAutore = idAutore;
        this.nomeAutore = nomeAutore;
        this.nazionalita = nazionalita;
    }

    public Long getIdAutore() {
        return idAutore;
    }

    public void setIdAutore(Long idAutore) {
        this.idAutore = idAutore;
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    @Override
    public String toString() {
        return "AutoreEntity{" +
                "idAutore=" + idAutore +
                ", nomeAutore='" + nomeAutore + '\'' +
                ", nazionalita='" + nazionalita + '\'' +
                '}';
    }
}
