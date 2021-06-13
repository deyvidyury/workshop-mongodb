package com.yury.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yury.workshopmongo.domin.Post;
import com.yury.workshopmongo.repository.PostRepository;
import com.yury.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

//	public User insert(User obj) {
//		return repo.insert(obj);
//	}
//
//	public void delete(String id) {
//		findById(id);
//		repo.deleteById(id);
//	}
//
//	public User update(User obj) {
//		User newObj = findById(obj.getId());
//		updateData(newObj, obj);
//		return repo.save(newObj);
//	}
//
//	private void updateData(User newObj, User obj) {
//		newObj.setName(obj.getName());
//		newObj.setEmail(obj.getEmail());
//	}
//
//	public User fromDTO(UserDTO objDTO) {
//		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
//	}
}