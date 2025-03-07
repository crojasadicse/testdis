package com.dn.disp.services.impl;

import org.springframework.stereotype.Service;

import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.models.ClienteEntity;
import com.dn.disp.repository.IClienteRepository;
import com.dn.disp.services.IClienteService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ClienteServiceImp implements IClienteService {

private final IClienteRepository iClienteRepository;

    @Override
    public ClienteCreatedDto create(ClienteCreatedDto entity) {


        ClienteEntity cliente = ClienteEntity.builder()
                .name(entity.getName())
                .lastName(entity.getLastName())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .build();

        // Save the entity

        cliente = iClienteRepository.save(cliente);


        return ClienteCreatedDto.builder()
                .name(cliente.getName())
                .lastName(cliente.getLastName())
                .phone(cliente.getPhone())
                .email(cliente.getEmail())
                .build();


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
