/**
 * 
 */
package org.ermain.springboot.recipe.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * @author Ermain
 *
 */
@Entity
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@OneToOne
	private Recipe recipe;
	
	/*
	 * 	This  @Lob annotation means allow for the storage of a large object (i.e. images, string, video, etc.)
	 */
	@Lob
	private String recipeNotes;
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////// Getters and Setters ////////////////////////////////////////////
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}
	/**
	 * @param recipe the recipe to set
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	/**
	 * @return the recipeNotes
	 */
	public String getRecipeNotes() {
		return recipeNotes;
	}
	/**
	 * @param recipeNotes the recipeNotes to set
	 */
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
	
	
}
