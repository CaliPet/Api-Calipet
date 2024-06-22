package br.com.calipet.api.calipet.repositories;


import br.com.calipet.api.calipet.models.Prato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PratoRepository extends JpaRepository<Prato, Integer> {
    List<Prato> findAll();
}
