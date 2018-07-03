/**
 * 
 */
package org.ermain.springboot.recipe.Repository;

import java.util.Optional;

import org.ermain.springboot.recipe.Domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ermain
 *
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{

	Optional<UnitOfMeasure> findByDescription(String description);
}
