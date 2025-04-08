package com.dn.disp.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoEntity {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;
    private String categoria;

}
