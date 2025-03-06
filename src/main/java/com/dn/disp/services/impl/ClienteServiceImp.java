package com.dn.disp.services.impl;

import org.springframework.stereotype.Service;

import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.models.ClienteEntity;
import com.dn.disp.services.IClienteService;


@Service
public class ClienteServiceImp implements IClienteService {

    @Override
    public ClienteCreatedDto create(ClienteCreatedDto entity) {

        ClienteEntity cliente = new ClienteEntity();
        cliente.setName(entity.getName());
        cliente.setLastName(entity.getLastName());
        cliente.setPhone(entity.getPhone() );
        cliente.setEmail(entity.getEmail());





        return entity;
        


    }

    @Override
    public ClienteCreatedDto update(ClienteCreatedDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ClienteCreatedDto get(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public String getNomString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNomString'");
    }

}
