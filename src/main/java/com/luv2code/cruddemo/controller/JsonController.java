package com.luv2code.cruddemo.controller;


import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.cruddemo.bean.UserInterface;
import com.luv2code.cruddemo.bean.reqbody;
import com.luv2code.cruddemo.service.UserService;



@RestController
@RequestMapping("/api")
public class JsonController {
	private UserService userService;
	
	public JsonController(UserService userService)
	{
		this.userService=userService;
	}
	
	
	
	@GetMapping(path="/userInterface",produces = MediaType.APPLICATION_JSON_VALUE)
	public String  userInterface()
	{
		//System.out.println(userService.userInterfacelist().toString());
		return userService.list("userInterface");
	}
	@PostMapping(path="/blogInterface",produces = MediaType.APPLICATION_JSON_VALUE)
	public String  blogInterface(@RequestBody reqbody req)
	{
		//System.out.println(userService.userInterfacelist().toString());
		return userService.list("blogInterface");
	}
	@PostMapping(path="/blogReaction",produces = MediaType.APPLICATION_JSON_VALUE)
	public String  blogReaction(@RequestBody reqbody req)
	{
		//System.out.println(userService.userInterfacelist().toString());
		return userService.list("blogReaction");
	}
	@PostMapping(path="/blogComment",produces = MediaType.APPLICATION_JSON_VALUE)
	public String  blogComment(@RequestBody reqbody req)
	{
		//System.out.println(userService.userInterfacelist().toString());
		return userService.list("blogComment");
	}
	@PostMapping(path="/blogSuggestion",produces = MediaType.APPLICATION_JSON_VALUE)
	public String  blogSuggestion(@RequestBody reqbody req)
	{
		//System.out.println(userService.userInterfacelist().toString());
		return userService.list("blogSuggestion");
	}

}
