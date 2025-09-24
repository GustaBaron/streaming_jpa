package com.univille.jpa.streaming.Repository;

import com.univille.jpa.streaming.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario,Integer> {
}
