package com.dn.disp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.dn.disp.controller.ClienteController;
import com.dn.disp.dto.ClienteCreatedDto;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class DispApplicationTests {

 	//private final ClienteController controller = new ClienteController(); // Instancia real del controlador


	@Test
	void contextLoads() {
	}

    //@Test
    // void createCliente_ShouldReturnCreatedAndValidObject() throws Exception {
    //     ClienteCreatedDto cliente = new ClienteCreatedDto();
    //     cliente.setName("Juan");
    //     cliente.setLastName("Perez");
        
    //     ResponseEntity<ClienteCreatedDto> response = controller.create(cliente);
        
    //     assertEquals(HttpStatus.CREATED, response.getStatusCode());
    //     assertEquals(cliente.getName(), response.getBody().getName());
    //     assertEquals(cliente.getLastName(), response.getBody().getLastName());
    // }	

}
