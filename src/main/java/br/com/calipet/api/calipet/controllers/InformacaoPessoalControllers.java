package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.InformacaoPessoal;
import br.com.calipet.api.calipet.repositories.InformacaoPessoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacaopessoal")
public class InformacaoPessoalControllers {

    @Autowired
    private InformacaoPessoalRepository informacaoPessoalRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<InformacaoPessoal> listar(){
        List<InformacaoPessoal> informacaoPessoal = informacaoPessoalRepository.findAll();
        return informacaoPessoal;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
        public InformacaoPessoal adicionar(@RequestBody InformacaoPessoal informacaoPessoal) {return informacaoPessoalRepository.save(informacaoPessoal);}

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody InformacaoPessoal informacaoPessoal){
        if (informacaoPessoal.getIdInformacao()>0){
            return "Editado com sucesso";
        }
        return "Informacao pessoal não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody InformacaoPessoal informacaoPessoal){
        if (informacaoPessoal.getIdInformacao()>0){
            informacaoPessoalRepository.delete(informacaoPessoal);
            return "Informacao pessoal apagado";
        }
        return "Informacao pessoal não encontrado";
    }
}
