package io.github.pkuwwt.demo.web.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import io.github.pkuwwt.demo.repositories.UserRepository;
import io.github.pkuwwt.demo.domain.User;
import java.util.List;

@Controller
public class HomeController
{
	@Autowired
	private UserRepository userRepo;
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepo.findAll());
		return "index";
	}
	@ResponseBody
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
	@ResponseBody
	@PostMapping("/user/add")
	public User addUser(@RequestBody User user)
	{
		User savedUser = userRepo.save(user);
		return savedUser;
	}
}
