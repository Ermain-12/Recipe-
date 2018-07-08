/**
 * 
 */
package org.ermain.springboot.recipe.Domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ermain
 *
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	// The 'categories' property in the entity class owns this relationship 
	@ManyToMany(mappedBy = "categories")
	private Set<Recipe> recipes;
	
	
	
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the recipes
	 */
	public Set<Recipe> getRecipes() {
		return recipes;
	}

	/**
	 * @param recipes the recipes to set
	 */
	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	
}
