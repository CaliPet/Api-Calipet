package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Parceiro")
@Data
@NoArgsConstructor
public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Parceiros")
    private  Integer idparceiro;

    @Column(name = "Data_Inicio")
    private Date dataInicio;

    @Column(name = "CPF_CNPJ")
    private Integer cpfCnpj;
}
