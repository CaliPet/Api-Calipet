package br.com.calipet.api.calipet.repositories;


import br.com.calipet.api.calipet.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {
    List<Ingrediente> findAll();
}
