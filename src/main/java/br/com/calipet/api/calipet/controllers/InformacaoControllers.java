package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Informacao;
import br.com.calipet.api.calipet.repositories.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacao")
public class InformacaoControllers {

    @Autowired
    private InformacaoRepository informacaoRepository;

    @CrossOrigin
    @GetMapping("/")

    public List<Informacao> listar(){
        List<Informacao> informacao = informacaoRepository.findAll();
        return informacao;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Informacao adicionar(@RequestBody Informacao informacao)
    {return informacaoRepository.save(informacao);}


    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Informacao informacao){
        if (informacao.getIdPostagem()>0){
            informacaoRepository.save(informacao);
            return "Editado com sucesso";
        }
        return "Informacao não encontrado";
    }


    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Informacao informacao){
        if (informacao.getIdPostagem()>0){
            informacaoRepository.delete(informacao);
            return "Informacao apagado";
        }
        return "Informacao não encontrado";
    }

}
