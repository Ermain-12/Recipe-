/**
 * 
 */
package org.ermain.springboot.recipe.Controllers;

import java.util.Optional;

import org.ermain.springboot.recipe.Domain.Category;
import org.ermain.springboot.recipe.Domain.UnitOfMeasure;
import org.ermain.springboot.recipe.Repository.CategoryRepository;
import org.ermain.springboot.recipe.Repository.UnitOfMeasureRepository;
import org.ermain.springboot.recipe.Service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ermain
 *
 */
@Slf4j
@SuppressWarnings("unused")
@Controller
public class IndexController {
	
	private final RecipeService recipeService;
	
	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}
	


	@RequestMapping({"", "/", "/index"})
	public String getIndexPage(Model model) {
		

		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
