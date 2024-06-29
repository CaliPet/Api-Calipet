package br.com.calipet.api.calipet.controllers;


import br.com.calipet.api.calipet.models.Login;
import br.com.calipet.api.calipet.models.Usuario;
import br.com.calipet.api.calipet.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoginControllers {

    @Autowired
    private UsuarioRepository usuarioRepository;//objeto

    @CrossOrigin//
    @PostMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody Login loginRequisicao) {
        String email = loginRequisicao.getEmail();
        String senha = loginRequisicao.getSenha();


        boolean usuarioExiste = usuarioRepository.existsByEmailAndSenha(email, senha);

        if (usuarioExiste) {
            Usuario usuario = usuarioRepository.findByEmail(email);
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha incorretos.");
        }
    }
}