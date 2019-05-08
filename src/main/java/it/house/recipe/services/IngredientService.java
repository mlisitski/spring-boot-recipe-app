package it.house.recipe.services;

import it.house.recipe.commands.IngredientCommand;

/**
 * Created by max on 2019-05-07
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long id);
}
