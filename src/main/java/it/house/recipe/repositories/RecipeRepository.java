package it.house.recipe.repositories;

import it.house.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by max on 2019-04-06
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
