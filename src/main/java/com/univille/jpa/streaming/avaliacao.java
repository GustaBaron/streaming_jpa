package com.univille.jpa.streaming;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class avaliacao {
    @Id
    @GeneratedValue
    private int id;
    private String perfil_id;
    private String video_id;
    private String nota;
    private String comentario;

    public avaliacao(int id) {
        this.id = id;
    }

    public avaliacao(int id, String perfil_id, String video_id, String nota, String comentario) {
        this.id = id;
        this.perfil_id = perfil_id;
        this.video_id = video_id;
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(String perfil_id) {
        this.perfil_id = perfil_id;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
