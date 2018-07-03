/**
 * 
 */
package org.ermain.springboot.recipe.Service;

import java.util.Set;

import org.ermain.springboot.recipe.Domain.Recipe;

/**
 * @author Ermain
 *
 */
public interface RecipeService {

	Set<Recipe> getRecipes();
}
