@Controller
public class testControllers {
	@ResponseBody
	@RequestMapping("/sugar")
public String getSugar() {
	return "this is sugar"
}
}
