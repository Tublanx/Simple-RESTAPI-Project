package co.lgh.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.lgh.rest.mapper.UserProfileMapper;
import co.lgh.rest.model.UserProfile;

@RestController
public class UserController {

	private UserProfileMapper mapper;

	public UserController(UserProfileMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/user/{id}")
	public UserProfile getUserProfile(@PathVariable("id") String id) {
		return mapper.getUserProfile(id);
	}

	@GetMapping("/user/all")
	public List<UserProfile> getUserProfileList() {
		return mapper.getUserProfileList();
	}

	@PutMapping("/user/{id}")
	public void putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name,
			@RequestParam("phone") String phone, @RequestParam("addr") String addr) {
		mapper.insertUserProfile(id, name, phone, addr);
	}

	@PostMapping("/user/{id}")
	public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name,
			@RequestParam("phone") String phone, @RequestParam("addr") String addr) {
		mapper.updateUserProfile(id, name, phone, addr);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUserProfile(@PathVariable("id") String id) {
		mapper.deleteUserProfile(id);
	}

}
