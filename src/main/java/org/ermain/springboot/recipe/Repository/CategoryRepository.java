/**
 * 
 */
package org.ermain.springboot.recipe.Repository;

import org.ermain.springboot.recipe.Domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ermain
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
