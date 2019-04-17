package it.house.recipe.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by max on 2019-04-11
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
