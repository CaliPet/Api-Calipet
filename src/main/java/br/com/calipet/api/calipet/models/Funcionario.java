package br.com.calipet.api.calipet.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity// identificacao
@Table(name = "Funcionario")
@Data//get e setter lombok
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para configurar um valor para o id
    @Column(name = "ID_funcionario") // para as que utilizam _ no nome
    private Integer idfuncionario; // tipo int

    @Column (name = "Data_Nascimento")
    private Date dataNascimento;

    private Integer CPF;

    private String Cargo;

    private Double Salario;
}
