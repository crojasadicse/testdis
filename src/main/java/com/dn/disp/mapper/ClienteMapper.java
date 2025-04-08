package com.dn.disp.mapper;



import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.dto.ClienteResponseDto;
import com.dn.disp.models.ClienteEntity;


public interface ClienteMapper {

    ClienteEntity toEntity(ClienteCreatedDto clienteCreatedDto);

    ClienteResponseDto toClienteResponseDto(ClienteEntity clienteEntity);

}
