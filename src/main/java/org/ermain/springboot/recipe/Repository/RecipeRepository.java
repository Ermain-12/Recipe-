/**
 * 
 */
package org.ermain.springboot.recipe.Repository;

import org.ermain.springboot.recipe.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ermain
 *
 *Here, the RecipeRepository class is extended using the CrudRepository class. This means that the 
 *CRUD functionality is only extended towards the recipe class using the ID type of Long.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{

	
}
