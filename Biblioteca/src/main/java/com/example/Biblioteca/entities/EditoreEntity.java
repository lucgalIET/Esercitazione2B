package com.example.Biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "editore")
public class EditoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEditore;

    @Column(name = "nome")
    private String nomeEditore;

    @Column(name = "contatto")
    private String contattoEditore;

    public EditoreEntity() {
    }

    public EditoreEntity(Long idEditore, String nomeEditore, String contattoEditore) {
        this.idEditore = idEditore;
        this.nomeEditore = nomeEditore;
        this.contattoEditore = contattoEditore;
    }

    public Long getIdEditore() {
        return idEditore;
    }

    public void setIdEditore(Long idEditore) {
        this.idEditore = idEditore;
    }

    public String getNomeEditore() {
        return nomeEditore;
    }

    public void setNomeEditore(String nomeEditore) {
        this.nomeEditore = nomeEditore;
    }

    public String getContattoEditore() {
        return contattoEditore;
    }

    public void setContattoEditore(String contattoEditore) {
        this.contattoEditore = contattoEditore;
    }

    @Override
    public String toString() {
        return "EditoreEntity{" +
                "idEditore=" + idEditore +
                ", nomeEditore='" + nomeEditore + '\'' +
                ", contattoEditore='" + contattoEditore + '\'' +
                '}';
    }
}
