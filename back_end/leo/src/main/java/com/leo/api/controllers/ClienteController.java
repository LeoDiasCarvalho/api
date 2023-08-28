package com.leo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.api.dao.ClienteDAO;
import com.leo.api.entities.Cliente;
import com.leo.api.services.ClienteService;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping 
	public ResponseEntity<List<ClienteDAO>> buscarClientes(){
		List<ClienteDAO> dao = service.buscarTodosClientes();
		return ResponseEntity.status(200).body(dao);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClienteDAO> buscarClientePorId(@PathVariable Long id){
		ClienteDAO dao = service.buscarClientePorID(id);
		return ResponseEntity.status(200).body(dao);
	}
	
	@PostMapping
	public ResponseEntity<ClienteDAO> salvarCliente(@RequestBody Cliente cliente){
		Cliente obj = service.salvarCliente(cliente);
		ClienteDAO dao = new ClienteDAO(obj);
		return ResponseEntity.status(201).body(dao);
	}
	
	@PutMapping
	public ResponseEntity<ClienteDAO> atualizarCliente(@RequestBody Cliente cliente){
		Cliente obj = service.atualizarCliente(cliente);
		ClienteDAO dao = new ClienteDAO(obj);
		return ResponseEntity.status(200).body(dao);
	}
	
	@DeleteMapping
	public void excluirCliente(Cliente cliente) {
		service.deletarCliente(cliente);
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluirClientePorId(@PathVariable Long id) {
		service.deletarClientePorId(id);
	}

}
