package com.yury.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yury.workshopmongo.domin.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
