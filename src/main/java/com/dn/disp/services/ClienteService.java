package com.dn.disp.services;

import com.dn.disp.commons.CrudOperations;

import com.dn.disp.models.ClienteEntity;


public interface ClienteService extends CrudOperations<ClienteEntity, Long> {

    String getDevuelveNombre();

}
