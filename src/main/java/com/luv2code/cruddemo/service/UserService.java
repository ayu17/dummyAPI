package com.luv2code.cruddemo.service;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;



import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;


import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserService {
	ObjectMapper mapper = new ObjectMapper();
	private File file;

	public String list(String check) {
		try {
			switch (check) {
			case "userInterface":
				file = ResourceUtils.getFile("classpath:userInterface.json");
				break;
			case "blogInterface":
				file = ResourceUtils.getFile("classpath:blogInterface.json");
				break;
			case "blogReaction":
				file = ResourceUtils.getFile("classpath:blogReaction.json");
				break;
			case "blogComment":
				file = ResourceUtils.getFile("classpath:blogComment.json");
				break;
			case "blogSuggestion":
				file = ResourceUtils.getFile("classpath:blogSuggestion.json");
				break;
			}

			

			// Read File Content
			String content = new String(Files.readAllBytes(file.toPath()));

			return content;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
