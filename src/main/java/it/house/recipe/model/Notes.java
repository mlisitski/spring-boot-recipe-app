package it.house.recipe.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by max on 2019-04-09
 */

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
