package br.com.calipet.api.calipet.controllers;

import br.com.calipet.api.calipet.models.Funcionario;
import br.com.calipet.api.calipet.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
//rotas crud
@RestController
@RequestMapping("/funcionario")
public class FuncionarioControllers {


    @Autowired// ligacao direta
    private FuncionarioRepository funcionarioRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Funcionario> listar(){
        List<Funcionario> funcionario = funcionarioRepository.findAll();
        return funcionario;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Funcionario adicionar(@RequestBody Funcionario funcionario) {return funcionarioRepository.save(funcionario);}


    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Funcionario funcionario){
        //Verifica ID valido
     if(funcionario.getIdfuncionario()>0) {
         funcionarioRepository.save(funcionario);// salva o objeto
         return "Editado com sucesso";
     }
     return "Funcionario não encontrado";
    }


    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Funcionario funcionario){
        if (funcionario.getIdfuncionario()>0){
            funcionarioRepository.delete(funcionario);
            return "Funcionario apagado";
        }
        return "Funcionario não encontrado";
    }
}
