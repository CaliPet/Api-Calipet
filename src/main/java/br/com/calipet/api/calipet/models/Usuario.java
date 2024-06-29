package br.com.calipet.api.calipet.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Usuario")
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_usuario")
    private Integer idUsuario;



    @Column(name = "Email")
    private String email;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Senha")
    private String senha;


}

