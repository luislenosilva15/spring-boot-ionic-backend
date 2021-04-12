package com.compasso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compasso.cursomc.domain.Pedido;
import com.compasso.cursomc.repositories.PedidoRepository;
import com.compasso.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) { 
		 Optional<Pedido> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())); 
		} 
}


