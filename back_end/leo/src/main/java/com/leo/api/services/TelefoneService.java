package com.leo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leo.api.dao.TelefoneDAO;
import com.leo.api.entities.Telefone;
import com.leo.api.repositories.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository repo;
	
	@Transactional(readOnly = true)
	public List<TelefoneDAO> buscarTodosTelefones(){
		List<Telefone> obj = repo.findAll();
		return obj.stream().map(TelefoneDAO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public TelefoneDAO buscarTelefonePorID(Long id) {
		Telefone obj = repo.findById(id).get();
		return new TelefoneDAO(obj);
	}
	
	@Transactional(readOnly = false)
	public Telefone salvarTelefone(Telefone telefone) {
		Telefone obj = repo.save(telefone);
		return obj;
		
	}
	
	@Transactional(readOnly = false)
	public Telefone atualizarTelefone(Telefone telefone) {
		Telefone obj = repo.save(telefone);
		return obj;
	}
	
	@Transactional(readOnly = false)
	public void excluirTelefone(Telefone telefone) {
		repo.delete(telefone);
	}
	
	@Transactional(readOnly = false)
	public void excluirTelefonePoId(Long id) {
		repo.deleteById(id);
	}

}
