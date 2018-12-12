package com.bolsadeideas.springbootweb.app.models.dao;

import java.util.List;

import com.bolsadeideas.springbootweb.app.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);

}
