package com.dn.disp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteResponseDto {

    private Long id;
    private String name;
    private String lastName;
    //private String email;
    //private String phone;    
    
}
