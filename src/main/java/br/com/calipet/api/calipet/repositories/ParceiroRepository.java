package br.com.calipet.api.calipet.repositories;


import br.com.calipet.api.calipet.models.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Integer> {
    List<Parceiro> findAll();
}



