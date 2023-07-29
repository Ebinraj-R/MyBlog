package com.myblogrestapi.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblogrestapi.Entity.Post;
import com.myblogrestapi.Entity.PostDTO;
import com.myblogrestapi.Repository.BlogRepository;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogrep;
	@Autowired
	private ModelMapper modelMapper;
	
	
	public PostDTO createNewpost(PostDTO postDTO) {
				Post post = modelMapper.map(postDTO,Post.class);
				Post savedpost = blogrep.save(post);
				return modelMapper.map(savedpost,PostDTO.class);
		
	}


	

}
