package com.dn.disp.mapper.impl;

import org.springframework.stereotype.Component;

import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.dto.ClienteResponseDto;
import com.dn.disp.models.ClienteEntity;
import com.dn.disp.mapper.ClienteMapper;

@Component
public class ClienteServiceImpl implements ClienteMapper {

    @Override
    public ClienteEntity toEntity(ClienteCreatedDto clienteCreatedDto) {
        return ClienteEntity.builder()
                .name(clienteCreatedDto.getName() )
                .lastName(clienteCreatedDto.getLastName())
                .email(clienteCreatedDto.getEmail())
                .phone(clienteCreatedDto.getPhone())
                .build();
    }

    @Override
    public ClienteResponseDto toClienteResponseDto(ClienteEntity clienteEntity) {
        return ClienteResponseDto.builder()
                .id(clienteEntity.getId())
                .name(clienteEntity.getName())
                .lastName(clienteEntity.getLastName())
                //.email(clienteEntity.getEmail())
                //.phone(clienteEntity.getPhone())
                .build();
        
    }



}
