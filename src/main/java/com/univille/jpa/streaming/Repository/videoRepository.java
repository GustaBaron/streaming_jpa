package com.univille.jpa.streaming.Repository;

import com.univille.jpa.streaming.entity.video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface videoRepository extends JpaRepository<video, Long> {
    List<video> findByTituloContainingIgnoreCaseOrderByTituloAsc(String titulo);

    List<video> findByCategoriaNomeOrderByTituloAsc(String nomeCategoria);
}
