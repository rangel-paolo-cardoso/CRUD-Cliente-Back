package com.crudcliente.crudbackend.repository;

import com.crudcliente.crudbackend.model.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
  
}
