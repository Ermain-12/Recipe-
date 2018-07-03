/**
 * 
 */
package org.ermain.springboot.recipe.Domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Ermain
 *
 */

// Make sure that our class is picked up by the package-scan as an entity object
@Entity
public class Recipe {
	
	// Create a property to store the id of the object
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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
	private String description;
	private Integer preptime;
	private Integer cooktime;
	private Integer servings;
	private String source;
	private String url;
	private String directions;
	
	/*
	 * 	Here, the recipe owns the relationship between itself and the Ingredient.
	 * There is also an established 1-to-many relationship between the Recipe and the ingredient.
	 * (One recipe for many recipes)
	 * 
	 * The mappedBy property defines the property in the child class which maps it to the parent class.
	 * Here, the set of ingredients will be stored in a property called recipe.
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	private Set<Ingredient> ingredients;
	
	/*
	 * TODO: add a difficult property
	 */
	@Lob
	private Byte[] image;
	
	/*
	 * 	This @OneToOne annotation creates a 1-to-1 relationship between the Notes class and the 
	 * Recipe class. The CascadeType.ALL means that the Recipe.java class owns the relations (i.e. If
	 * the user deletes a Recipe, they would also delete the Notes (Notes.java) object attached to it.)
	 */
	@OneToOne(cascade = CascadeType.ALL)
	private Notes notes;
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
	 * @return the preptime
	 */
	public Integer getPreptime() {
		return preptime;
	}
	/**
	 * @param preptime the preptime to set
	 */
	public void setPreptime(Integer preptime) {
		this.preptime = preptime;
	}
	/**
	 * @return the cooktime
	 */
	public Integer getCooktime() {
		return cooktime;
	}
	/**
	 * @param cooktime the cooktime to set
	 */
	public void setCooktime(Integer cooktime) {
		this.cooktime = cooktime;
	}
	/**
	 * @return the servings
	 */
	public Integer getServings() {
		return servings;
	}
	/**
	 * @param servings the servings to set
	 */
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the directions
	 */
	public String getDirections() {
		return directions;
	}
	/**
	 * @param directions the directions to set
	 */
	public void setDirections(String directions) {
		this.directions = directions;
	}
	/**
	 * @return the image
	 */
	public Byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Byte[] image) {
		this.image = image;
	}
	/**
	 * @return the notes
	 */
	public Notes getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	
}
