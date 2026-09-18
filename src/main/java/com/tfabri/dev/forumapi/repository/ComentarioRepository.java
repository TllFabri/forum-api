package com.tfabri.dev.forumapi.repository;

import com.tfabri.dev.forumapi.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}