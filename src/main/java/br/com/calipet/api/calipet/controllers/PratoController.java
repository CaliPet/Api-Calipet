package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Prato;
import br.com.calipet.api.calipet.repositories.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prato")
public class PratoController {

    @Autowired
    private PratoRepository pratoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Prato> listar(){
        List<Prato> prato = pratoRepository.findAll();
        return prato;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Prato adicionar(@RequestBody Prato prato){return pratoRepository.save(prato);}


    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Prato prato){
        if (prato.getIdPrato()>0) {
            pratoRepository.save(prato);
            return "Editado com sucesso";
        }
           return "Prato não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Prato prato){
        if (prato.getIdPrato()>0){
            pratoRepository.delete(prato);
            return "Prato apagado";
        }
        return "Prato não encontrado";
    }
}
