/**
 * 
 */
package org.ermain.springboot.recipe.Repository;

import java.util.Optional;

import org.ermain.springboot.recipe.Domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ermain
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

	Optional<Category> findByDescription(String description);
}
