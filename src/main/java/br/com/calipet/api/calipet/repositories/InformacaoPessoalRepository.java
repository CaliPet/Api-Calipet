package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.InformacaoPessoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformacaoPessoalRepository extends JpaRepository<InformacaoPessoal, Integer> {


    List<InformacaoPessoal> findAll();

    void delete(InformacaoPessoal informacaoPessoal);

    InformacaoPessoal save(InformacaoPessoal informacaoPessoal);
}
