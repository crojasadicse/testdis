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
import com.dn.disp.services.IClienteService;
import com.dn.disp.vo.IClienteVo;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@AllArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {


    private final IClienteService serv;

    private final IClienteVo vo;


    @PostMapping("")
    public ResponseEntity<ClienteResponseDto> proc(@RequestBody ClienteCreatedDto d ) {

        System.out.println("Entrando al método proc");

        ClienteEntity e = vo.toEntity(d);

        ClienteEntity e2 = serv.create(e);

        ClienteResponseDto r = vo.toClienteResponseDto(e2);

        return new ResponseEntity<>(r, HttpStatus.resolve(201));
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDto> g(@PathVariable Long ident) {

        System.out.println("Intentando obtener cliente con id: " + ident);

        ClienteEntity ent = null;
        try {
             ent = serv.get(ident);
             ClienteResponseDto resp = vo.toClienteResponseDto(ent);
             return new ResponseEntity<>(resp, HttpStatus.resolve(302) );
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @PutMapping("")
    public ResponseEntity<ClienteCreatedDto> upd(@RequestBody ClienteCreatedDto dd ) {
        System.out.println("Método upd llamado pero no hace nada.");
        return new ResponseEntity<>(dd, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteCreatedDto> del(@PathVariable String i) {
        ClienteCreatedDto temp = new ClienteCreatedDto();
        System.out.println("Método del llamado para id (string): " + i + " - pero no borra nada.");
        return new ResponseEntity<>(temp, HttpStatus.resolve(200));
    }

    
}
