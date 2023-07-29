package com.myblogrestapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myblogrestapi.Entity.PostDTO;
import com.myblogrestapi.Service.BlogService;

@RestController
@RequestMapping("/api/post")
public class Blogcontroller {
	
	@Autowired
	private BlogService blogService;
	
	@PostMapping
	public ResponseEntity<PostDTO>createPost(@RequestBody PostDTO postDto){
		PostDTO result=blogService.createNewpost(postDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	

}
