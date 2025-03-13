package com.dn.disp.vo;



import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.dto.ClienteResponseDto;
import com.dn.disp.models.ClienteEntity;


public interface IClienteVo {

    ClienteEntity toEntity(ClienteCreatedDto clienteCreatedDto);

    ClienteResponseDto toClienteResponseDto(ClienteEntity clienteEntity);

}
