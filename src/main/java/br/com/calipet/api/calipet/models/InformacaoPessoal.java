package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Informacao_Pessoal_Contato")
@Data
@NoArgsConstructor
public class InformacaoPessoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_informacao")
    private Integer idInformacao;

    @Column(name = "ID_Contato")
    private Integer idContato;

    @Column (name = "Data_Inicio")
    private Date dataInicio;

    private String Nome;

    private Integer Numero;

    private String CEP;

    private  String Email;

    private String Telefone;
}
