package br.com.calipet.api.calipet.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Informacao")
@Data
@NoArgsConstructor
public class Informacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Postagem")
    private Integer IdPostagem;

    private String Pet;

    private String Descricao;

    private String Titulo;

    private String Imagem;

    public boolean getIdInformacao() {
        return false;
    }
}
