package com.dn.disp.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteEntity  {

    private String name;
    private String lastName;
    private String email;
    private String phone;
    
}
