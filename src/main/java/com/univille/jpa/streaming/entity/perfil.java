package com.univille.jpa.streaming.entity;


import jakarta.persistence.*;

@Entity
public class perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_perfil;
    @ManyToOne
    private usuario usario;

    public perfil() {
    }

    public perfil(int id, String nome_perfil, usuario usario) {
        this.id = id;
        this.nome_perfil = nome_perfil;
        this.usario = usario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public usuario getUsario() {
        return usario;
    }

    public void setUsario(usuario usario) {
        this.usario = usario;
    }
}

