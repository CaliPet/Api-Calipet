package br.com.calipet.api.calipet.repositories;


import br.com.calipet.api.calipet.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
    List<Pet>findAll();
}
