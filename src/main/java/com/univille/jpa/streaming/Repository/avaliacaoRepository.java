package com.univille.jpa.streaming.Repository;

import com.univille.jpa.streaming.entity.avaliacao;
import com.univille.jpa.streaming.entity.video;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface avaliacaoRepository extends JpaRepository<avaliacao, Long> {

    @Query("SELECT a.video FROM avaliacao a GROUP BY a.video ORDER BY AVG(a.nota) DESC")
    List<video> findTop10VideosMaisBemAvaliados(Pageable pageable);
}
