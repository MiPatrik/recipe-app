package guru.springframework.recipeapp.services;

import guru.springframework.recipeapp.commands.RecipeCommand;
import guru.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long id);
}


