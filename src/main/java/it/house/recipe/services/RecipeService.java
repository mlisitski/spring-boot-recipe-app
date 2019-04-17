package it.house.recipe.services;

import it.house.recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by max on 2019-04-15
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
