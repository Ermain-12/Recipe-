/**
 * 
 */
package org.ermain.springboot.recipe.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ermain
 *
 */
@Controller
public class IndexController {

	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		return "index";
	}
}
