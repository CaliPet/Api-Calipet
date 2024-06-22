package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "informacao_pessoal_contato")
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
}
