package com.eltishehu.reactiveapp.services;

import com.eltishehu.reactiveapp.commands.RecipeCommand;
import com.eltishehu.reactiveapp.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
