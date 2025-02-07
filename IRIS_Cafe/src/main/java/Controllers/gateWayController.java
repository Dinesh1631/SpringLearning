package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class gateWayController {
	@RequestMapping("/orderPage")
    public String getOrder() {
    	return "orderPage";
    }
	
	@RequestMapping("/kitchen")
    public String getOrderState(HttpServletRequest request,Model model) {
		String order = request.getParameter("order");
		model.addAttribute("order_name", order);
    	return "kitchen";
    }
}
