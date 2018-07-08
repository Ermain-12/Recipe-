/**
 * 
 */
package org.ermain.springboot.recipe.Domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Ermain
 *
 */
public class CategoryTests {

	Category category;
	
	
	// This annotation means that we will create a new instance of the category class before 
	// each test method is carried out
	@Before
	public void setUp() {
		new Category();
	}
	
	@Test
	public void getId() throws Exception {
		Long idValue = 4l;
		category.setId(idValue);
		
		assertEquals(idValue, category.getId());
	}
	
	@Test
	public void getDescription() throws Exception{
		String description = "Tasty";
		
		category.setDescription(description);
		
		assertEquals(description, category.getDescription());
	}
	
	@Test
	public void getRecipes() throws Exception{
		
	}
}
