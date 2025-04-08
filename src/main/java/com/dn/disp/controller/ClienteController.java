package com.dn.disp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.dto.ClienteResponseDto;
import com.dn.disp.models.ClienteEntity;
import com.dn.disp.services.ClienteService;
import com.dn.disp.mapper.ClienteMapper;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@AllArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {


    private final ClienteService iClienteService;

    private final ClienteMapper iClienteVo;


    @PostMapping("")
    public ResponseEntity<ClienteResponseDto> create(@RequestBody ClienteCreatedDto clientecCreatedDto ) {

        ClienteEntity clienteEntity = iClienteVo.toEntity(clientecCreatedDto);

        ClienteEntity cliente = iClienteService.create(  clienteEntity );

        ClienteResponseDto clienteResponseDto = iClienteVo.toClienteResponseDto(cliente);

        return new ResponseEntity<>(clienteResponseDto, HttpStatus.CREATED);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDto> get(@PathVariable Long id) {

        ClienteEntity  cliente = iClienteService.get(id);

        ClienteResponseDto clienteResponseDto = iClienteVo.toClienteResponseDto(cliente);

        return new ResponseEntity<>(clienteResponseDto, HttpStatus.FOUND );
    }

    
    @PutMapping("")
    public ResponseEntity<ClienteCreatedDto> update(@RequestBody ClienteCreatedDto clientecCreatedDto ) {

        return new ResponseEntity<>(clientecCreatedDto, HttpStatus.CREATED);
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteCreatedDto> delete(@PathVariable String id) {
        ClienteCreatedDto cliente = new ClienteCreatedDto();
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    
}
