package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Ingrediente")
@Data
@NoArgsConstructor
public class Ingrediente {

    @Id
    @Column(name="id_ingrediente")
    private Integer idingrediente;

    private String Preparo;

    private String Imagem;


}
