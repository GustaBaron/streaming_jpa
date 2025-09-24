package com.univille.jpa.streaming.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
///  Indicar classe == entidade
@Entity
public class visualizacao {
    @Id  ///  indetifica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) ///  auto incremental
    private int id;
    @ManyToOne ///  relacao do campo
    private perfil perfil;
    @ManyToOne  /// relacao do campo
    private video video;
    private LocalDateTime data_hora;
    private int progresso;

    public visualizacao() {

    }


    public visualizacao(int id, perfil perfil, video video, LocalDateTime data_hora, int progresso) {
        this.id = id;
        this.perfil = perfil;
        this.video = video;
        this.data_hora = data_hora;
        this.progresso = progresso;
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

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }
}




