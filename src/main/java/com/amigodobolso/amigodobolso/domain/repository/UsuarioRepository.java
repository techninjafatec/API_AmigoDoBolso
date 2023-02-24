package com.amigodobolso.amigodobolso.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amigodobolso.amigodobolso.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    List<Usuario> findByEmail(String email);
}
