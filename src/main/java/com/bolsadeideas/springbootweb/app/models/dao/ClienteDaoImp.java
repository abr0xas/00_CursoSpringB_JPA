package com.bolsadeideas.springbootweb.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springbootweb.app.models.entity.Cliente;

@Repository
public class ClienteDaoImp implements IClienteDao{
	
	@PersistenceContext
	private EntityManager  em;	
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Cliente> findAll() {
		
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		em.persist(cliente);		
	}
	

}
