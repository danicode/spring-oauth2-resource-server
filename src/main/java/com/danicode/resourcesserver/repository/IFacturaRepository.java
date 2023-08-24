package com.danicode.resourcesserver.repository;

import com.danicode.resourcesserver.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaRepository extends CrudRepository<Factura, Long> {
}
