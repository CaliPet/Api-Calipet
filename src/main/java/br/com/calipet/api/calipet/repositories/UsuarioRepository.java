package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
        List<Usuario> findAll();


    }

