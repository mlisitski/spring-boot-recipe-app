package it.house.recipe.services;

import it.house.recipe.commands.RecipeCommand;
import it.house.recipe.model.Recipe;

import java.util.Set;

/**
 * Created by max on 2019-04-15
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
