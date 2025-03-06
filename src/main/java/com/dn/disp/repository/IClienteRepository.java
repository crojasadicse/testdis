package com.dn.disp.repository;

import org.springframework.data.repository.CrudRepository;

import com.dn.disp.models.ClienteEntity;

public interface IClienteRepository extends CrudRepository<ClienteEntity , Long>  {

}
