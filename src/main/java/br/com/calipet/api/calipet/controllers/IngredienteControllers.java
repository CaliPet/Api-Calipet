package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Ingrediente;
import br.com.calipet.api.calipet.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteControllers {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Ingrediente> listar(){
        List<Ingrediente> ingrediente = ingredienteRepository.findAll();
        return ingrediente;
    }


    @CrossOrigin
    @PostMapping("/adicionar")
    public Ingrediente adicionar(@RequestBody Ingrediente ingrediente) {return ingredienteRepository.save(ingrediente);}

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Ingrediente ingrediente){
        if (ingrediente.getIdingrediente()>0){
            ingredienteRepository.save(ingrediente);
            return "Editado com sucesso";
        }
        return "Ingrediente não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Ingrediente ingrediente){
        if (ingrediente.getIdingrediente()>0){
            ingredienteRepository.delete(ingrediente);
            return "Ingrediente apagado";
        }
        return "Ingrediente não encontrado";
    }
}
