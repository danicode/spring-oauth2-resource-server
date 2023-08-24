package com.danicode.resourcesserver.service;

import java.util.List;

import com.danicode.resourcesserver.entity.Cliente;
import com.danicode.resourcesserver.entity.Factura;
import com.danicode.resourcesserver.entity.Producto;
import com.danicode.resourcesserver.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();

	public Factura findFacturaById(Long id);

	public Factura saveFactura(Factura factura);

	public void deleteFacturaById(Long id);

	public List<Producto> findProductoByNombre(String term);

}
