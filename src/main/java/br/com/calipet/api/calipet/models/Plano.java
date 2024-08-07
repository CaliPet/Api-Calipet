package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Plano")
@Data
@NoArgsConstructor
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_plano")
    private Integer idplano;

    @Column(name="Pratos_premiuns")
    private String pratosPremiuns;

    private String Nome;

    private String Descricao;

    private Float Valor;

    private Float Descontos;
}
