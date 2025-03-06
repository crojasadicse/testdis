package com.dn.disp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dn.disp.dto.ClienteCreatedDto;
import com.dn.disp.services.IClienteService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@AllArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {


    private final IClienteService iClienteService;


    @PostMapping("")
    public ResponseEntity<ClienteCreatedDto> create(@RequestBody ClienteCreatedDto clientecCreatedDto ) {

        ClienteCreatedDto cliente = iClienteService.create(clientecCreatedDto);

        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteCreatedDto> get(@PathVariable Integer id) {
        ClienteCreatedDto cliente = new ClienteCreatedDto();

        return new ResponseEntity<>(cliente, HttpStatus.OK);
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
