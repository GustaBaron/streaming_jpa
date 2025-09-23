package com.univille.jpa.streaming;


import jakarta.persistence.*;

@Entity
public class avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private perfil perfil;
    @ManyToOne
    private video video;
    private int nota;
    private String comentario;

    public avaliacao() {
    }

    public avaliacao(int id, perfil perfil, video video, int nota, String comentario) {
        this.id = id;
        this.perfil = perfil;
        this.video = video;
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(perfil perfil) {
        this.perfil = perfil;
    }

    public video getVideo() {
        return video;
    }

    public void setVideo(video video) {
        this.video = video;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

