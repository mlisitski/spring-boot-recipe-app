package it.house.recipe.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by max on 2019-04-09
 */

@Data
//overrides to avoid loop and exception java.lang.StackOverflowError: null
@EqualsAndHashCode(exclude = "recipe")
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
