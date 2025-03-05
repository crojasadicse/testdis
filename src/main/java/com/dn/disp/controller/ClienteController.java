package com.dn.disp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dn.disp.dto.ClienteCreatedDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @PostMapping("")
    public ResponseEntity<ClienteCreatedDto> create(@RequestBody ClienteCreatedDto clientecCreatedDto ) {

        return new ResponseEntity<>(clientecCreatedDto, HttpStatus.CREATED);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteCreatedDto> getMethodName(@RequestParam String id) {
        ClienteCreatedDto cliente = new ClienteCreatedDto();
        cliente.setName("Juan");
        cliente.setLastName("Perez");
        cliente.setEmail("a@gmial.com" ); 
        return new ResponseEntity<>(cliente, HttpStatus.FOUND );
        
    }
    


    
}
