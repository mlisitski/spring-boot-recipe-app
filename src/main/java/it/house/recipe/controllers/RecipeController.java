package it.house.recipe.controllers;

import it.house.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by max on 2019-04-06
 */
@Controller
public class RecipeController {

    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping("/recipes")
    public String getRecipe(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes";
    }
}
