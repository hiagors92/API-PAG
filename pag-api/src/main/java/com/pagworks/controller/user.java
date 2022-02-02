package com.pagworks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pagworks.model.User;
import com.pagworks.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class user {

	//Coloca as informações no BD
	@Autowired
	private UserRepository userRepository;
	
	//Consulta todos os usuários
	@GetMapping()
		public List<User> lista() {
		return userRepository.findAll();								
		}
	
	//Consulta por usuário
	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	//Função de criação de usuários
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public User add(@RequestBody User user) {
		return userRepository.save(user);		
	}
	
	//Deleta todos os usuários
	@DeleteMapping()
	public User delete() {
		userRepository.deleteAll();
		return null;		
	}
	
	//Deleta um usuário
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteByID(@PathVariable Long id) {
		 userRepository.deleteById(id);
	}
	
	//Edita informações do usuário
	@PutMapping("/{id}")
	public User updateByID(@PathVariable Long id, @RequestBody User user) {
		User userUpdate=userRepository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado!"));
		
		userUpdate.setNome(user.getNome());
		userUpdate.setSaldo(user.getSaldo());
		return userRepository.save(userUpdate);
	}
	

}
