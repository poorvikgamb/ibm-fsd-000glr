package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHome()
	{
		return "homepage";
	}
	
	@PostMapping("/studentForm")
	public String viewView()
	{
		return "student-form";
	}

}
