package com.dn.disp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ventas")
public class VentasEntity {

    @Id
    private Long id;
    private String fecha;
    private Long cliente;

    @Column(name = "precio_total")
    private Double precioTotal;



}
