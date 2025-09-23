package com.univille.jpa.streaming;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class avaliacao {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private perfil perfil;
    private int video_id;
    private int nota;
    private String comentario;


    public avaliacao(int id, com.univille.jpa.streaming.perfil perfil, int video_id, int nota, String comentario) {
        this.id = id;
        this.perfil = perfil;
        this.video_id = video_id;
        this.nota = nota;
        this.comentario = comentario;
    }

    public avaliacao() {

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

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
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
