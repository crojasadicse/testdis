package com.dn.disp.services;

import com.dn.disp.commos.ICrudCommons;

import com.dn.disp.models.ClienteEntity;


public interface IClienteService extends ICrudCommons<ClienteEntity, Long> {

    String getDevuelveNombre();

}
