package it.house.recipe.model;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Receiver;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by max on 2019-04-25
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 4l;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
        String description = "Testing";
        category.setDescription(description);
        assertEquals("Testing", category.getDescription());
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        Set recipeSet = new HashSet<>();
        recipeSet.add(recipe);
        category.setRecipes(recipeSet);

        assertEquals(1, category.getRecipes().size());
    }
}