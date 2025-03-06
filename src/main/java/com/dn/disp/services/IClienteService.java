package com.dn.disp.services;

import com.dn.disp.commos.ICrudCommons;
import com.dn.disp.dto.ClienteCreatedDto;


public interface IClienteService extends ICrudCommons<ClienteCreatedDto, Integer> {

    String getNomString();

}
