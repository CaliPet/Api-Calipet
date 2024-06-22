package br.com.calipet.api.calipet.controllers;

import br.com.calipet.api.calipet.models.Usuario;
import br.com.calipet.api.calipet.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Usuario> listar() {
        List<Usuario> usuario = usuarioRepository.findAll();
        return usuario;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Usuario adicionar (@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Usuario usuario){
        if(usuario.getIdUsuario()>0){
            usuarioRepository.save(usuario);
            return "Editado com sucesso";
        }
        return "Usuario não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/delete")
    public String delete(@RequestBody Usuario usuario){
        if (usuario.getIdUsuario()>0){
            usuarioRepository.delete(usuario);
            return "Usuario apagado";
        }
        return "Usuario não encontrado";
    }

}

