package com.leo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.api.dao.ClienteDAO;
import com.leo.api.entities.Cliente;
import com.leo.api.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public List<ClienteDAO> buscarTodosClientes(){
		List<Cliente> obj = repo.findAll();
		return obj.stream().map(ClienteDAO::new).toList();
	}
	
	public ClienteDAO buscarClientePorID(Long id) {
		if(repo.existsById(id) == true){
			Cliente obj = repo.findById(id).get();
			return new ClienteDAO(obj);
		}else {
			return null;
		}
	}
	
	public ClienteDAO salvarCliente(Cliente cliente) {
		Cliente obj = repo.save(cliente);
		return new ClienteDAO(obj);
	}
	
	public ClienteDAO atualizarCliente(Cliente cliente) {
		Cliente obj = repo.save(cliente);
		return new ClienteDAO(obj);
	}
	
	public void deletarCliente(Cliente cliente) {
		if(repo.existsById(cliente.getId()) == true) {
			repo.delete(cliente);
		}
	}

}
