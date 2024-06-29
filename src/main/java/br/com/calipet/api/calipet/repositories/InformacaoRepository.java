package br.com.calipet.api.calipet.repositories;

import br.com.calipet.api.calipet.models.Informacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformacaoRepository extends JpaRepository<Informacao, Integer> {
    List<Informacao> findAll();

    Informacao save(Informacao informacao);

    void delete(Informacao informacao);
}
