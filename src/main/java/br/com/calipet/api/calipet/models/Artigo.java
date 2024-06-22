package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="artigo")
@Data
@NoArgsConstructor
public class Artigo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Artigo")
    private Integer idArtigo;

    private String Categoria;

    private String Imagem;

    private String Descricao;

    private String Titulo;

}
