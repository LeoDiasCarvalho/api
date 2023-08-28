package com.leo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leo.api.dao.ClienteDAO;
import com.leo.api.entities.Cliente;
import com.leo.api.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	@Transactional(readOnly = true)
	public List<ClienteDAO> buscarTodosClientes(){
		List<Cliente> obj = repo.findAll();
		return obj.stream().map(ClienteDAO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public ClienteDAO buscarClientePorID(Long id) {
			Cliente obj = repo.findById(id).get();
			return new ClienteDAO(obj);
		
	}
	
	@Transactional(readOnly = false)
	public Cliente salvarCliente(Cliente cliente) {
		Cliente obj = repo.save(cliente);
		return obj;
	}
	
	@Transactional(readOnly = false)
	public Cliente atualizarCliente(Cliente cliente) {
		Cliente obj = repo.save(cliente);
		return obj;
	}
	
	@Transactional(readOnly = false)
	public void deletarCliente(Cliente cliente) {
		if(repo.existsById(cliente.getId()) == true) {
			repo.delete(cliente);
		}
	}
	
	public void deletarClientePorId(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}else {
			
		}
	}

}
