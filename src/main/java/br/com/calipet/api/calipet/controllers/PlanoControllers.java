package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Plano;
import br.com.calipet.api.calipet.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plano")
public class PlanoControllers {

    @Autowired
    private PlanoRepository planoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Plano> listar(){
        List<Plano> plano = planoRepository.findAll();
        return plano;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Plano adicionar(@RequestBody Plano plano){return planoRepository.save(plano);}

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Plano plano){
        if (plano.getIdplano()>0){
            planoRepository.save(plano);
            return "Editado com sucesso";
        }
        return "Plano não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Plano plano){
        if (plano.getIdplano()>0){
            planoRepository.delete(plano);
            return "Plano apagado";
        }
        return "Plano não encontrado";
    }
}
