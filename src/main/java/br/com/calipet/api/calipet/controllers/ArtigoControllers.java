package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Artigo;
import br.com.calipet.api.calipet.repositories.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artigo")
public class ArtigoControllers {

    @Autowired
    private ArtigoRepository artigoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Artigo> listar(){
        List<Artigo> artigo = artigoRepository.findAll();
        return artigo;
    }

    @CrossOrigin
    @PostMapping("/adicionar")//para adicionar um novo artigo
    public Artigo adicionar(@RequestBody Artigo artigo) {return artigoRepository.save(artigo);}


    @CrossOrigin
    @PutMapping("/editar")//para editar um artigo existente
    public String editar(@RequestBody Artigo artigo){
        if (artigo.getIdArtigo()>0){
            artigoRepository.save(artigo);
            return "Editado com sucesso";
        }
        return "Artigo não encontrado";
    }


    @CrossOrigin
    @DeleteMapping("/delete")//para deletar um artigo existente
    public String delete(@RequestBody Artigo artigo){
        if (artigo.getIdArtigo()>0){
            artigoRepository.delete(artigo);
            return "Artigo apagado";
        }
        return "Artigo não encontrado";
    }

}
