package com.myblogrestapi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myblogrestapi.Entity.Post;

@Repository
public interface BlogRepository extends JpaRepository<Post , Long>{

}
