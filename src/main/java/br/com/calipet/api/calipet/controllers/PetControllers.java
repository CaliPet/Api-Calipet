package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Pet;
import br.com.calipet.api.calipet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetControllers {

    @Autowired
    private PetRepository petRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Pet> listar() {
        List<Pet> pet = petRepository.findAll();
        return pet;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Pet adicionar(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Pet pet) {
        if (pet.getIdpet() > 0) {
            petRepository.save(pet);
            return "Editado com sucesso";
        }
        return "Pet não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Pet pet) {
        if (pet.getIdpet() > 0) {
            petRepository.delete(pet);
            return "Pet apagado";
        }
        return "Pet não encontrado";
    }
}