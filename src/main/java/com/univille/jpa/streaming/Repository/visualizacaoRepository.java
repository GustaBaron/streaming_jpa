package com.univille.jpa.streaming.Repository;

import com.univille.jpa.streaming.entity.usuario;
import com.univille.jpa.streaming.entity.video;
import com.univille.jpa.streaming.entity.visualizacao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface visualizacaoRepository extends JpaRepository<visualizacao, Long> {

    @Query("SELECT v.video FROM visualizacao v GROUP BY v.video ORDER BY COUNT(v) DESC")
    List<video> findTop10VideosMaisAssistidos(Pageable pageable);

    @Query("SELECT v.perfil.usuario FROM visualizacao v GROUP BY v.perfil.usuario ORDER BY COUNT(v) DESC")
    List<usuario> findUsuariosPorVisualizacoesDesc(Pageable pageable);
}
