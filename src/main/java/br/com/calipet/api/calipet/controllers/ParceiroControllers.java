package br.com.calipet.api.calipet.controllers;



import br.com.calipet.api.calipet.models.Parceiro;
import br.com.calipet.api.calipet.repositories.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parceiro")
public class ParceiroControllers {

    @Autowired
    private ParceiroRepository parceiroRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Parceiro> listar() {
        List<Parceiro> parceiro = parceiroRepository.findAll();
        return parceiro;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Parceiro adicionar(@RequestBody Parceiro parceiro){return parceiroRepository.save(parceiro);}

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Parceiro parceiro){
      if (parceiro.getIdparceiro()>0){
          parceiroRepository.save(parceiro);
          return "Editado com sucesso";
      }
      return "Parceiro não encontrado";

    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Parceiro parceiro){
        if (parceiro.getIdparceiro()>0){
            parceiroRepository.delete(parceiro);
            return "Parceiro apagado";
        }
        return "Parceiro não encontrado";
    }


}
