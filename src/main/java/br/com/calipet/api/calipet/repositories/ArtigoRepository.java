package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, Integer> {
    List<Artigo> findAll();
}
