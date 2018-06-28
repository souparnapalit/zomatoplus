package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;

@RestController
@RequestMapping("/user")

public class UserController  {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)

	{
		User persistedUser= userRepository.save(user);
		return persistedUser;
	}
	@PostMapping("/Login")
	public User Login(@RequestBody String name,String password)
	{
	                                   	User persistedLogin=userRepository.findByNameAndPassword(name,password);
		return persistedLogin;
		
	}
	
	
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> users=userRepository.findAll();
		return users;
	}
}




























/*import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {

	

	@GetMapping("/all")
	public List<User> userLogin() {
		User user1=new User("Chandler Bing","got");
		User user2=new User("Chand B","goto");
		User user3=new User("Chan Bingo","get");
		List userList=new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		return userList;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		System.out.println(user.toString());
		
		return user;
	}
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		System.out.println(user.toString());
		
		return user;
	}


	

}*/
