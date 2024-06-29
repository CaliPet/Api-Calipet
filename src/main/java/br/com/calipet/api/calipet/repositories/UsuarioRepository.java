package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
        List<Usuario> findAll();



            @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.email = :email AND u.senha = :senha")
            boolean existsByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

            Usuario findByEmail(String email);
    }

