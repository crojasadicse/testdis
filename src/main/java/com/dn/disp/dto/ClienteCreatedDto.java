package com.dn.disp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteCreatedDto {

    private String name;
    private String lastName;
    private String email;
    private String phone;    
    
}
