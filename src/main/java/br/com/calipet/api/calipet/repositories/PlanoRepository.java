package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Integer> {
    List<Plano> findAll();
}
