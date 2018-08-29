package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvalidController {

	@RequestMapping("/fail")
	public String fail() {
		throw new IllegalStateException("this endpoint always fail");
	}

}
