package com.danicode.resourcesserver.repository;

import com.danicode.resourcesserver.entity.Cliente;
import com.danicode.resourcesserver.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("from Region")
	public List<Region> findAllRegiones();
}
