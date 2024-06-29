package br.com.calipet.api.calipet.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Pet")
@Data
@NoArgsConstructor
public class Pet {

    @Id
    @Column(name = "id_pet")
    private Integer idpet;

    @Column(name = "tipo_pet")
    private String tipoPet;
}
