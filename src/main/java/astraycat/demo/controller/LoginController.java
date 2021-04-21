package astraycat.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import astraycat.demo.model.Admin;
import astraycat.demo.service.AdminService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/admin")
public class LoginController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/login")
	public JSONObject login(@RequestBody Admin user) {
		JSONObject result = new JSONObject();
		int i = adminService.login(user);
		result.put("state", i);
		return result;
	}
}
