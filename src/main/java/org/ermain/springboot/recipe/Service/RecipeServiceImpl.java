/**
 * 
 */
package org.ermain.springboot.recipe.Service;

import java.util.HashSet;
import java.util.Set;

import org.ermain.springboot.recipe.Domain.Recipe;
import org.ermain.springboot.recipe.Repository.RecipeRepository;
import org.springframework.stereotype.Service;

/**
 * @author Ermain
 *
 */
@Service
public class RecipeServiceImpl implements RecipeService{

	private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
	
    
	@Override
	public Set<Recipe> getRecipes() {
		// TODO Auto-generated method stub
		Set<Recipe> recipeSet = new HashSet<>();
		
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}
	
}
