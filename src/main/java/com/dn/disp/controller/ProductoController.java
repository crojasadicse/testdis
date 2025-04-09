package com.dn.disp.controller;

import java.util.ArrayList;
import java.util.List;

import com.dn.disp.models.ProductoEntity;
import com.dn.disp.services.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prods")
public class ProductoController {

    @Autowired
    IProductoService srv;

    @GetMapping("/all")
    public List<ProductoEntity> list() {
        System.out.println("--- Obteniendo lista hardcodeada de productos ---");
        List<ProductoEntity> prods = new ArrayList<>();
        ProductoEntity p1 = ProductoEntity.builder()
                .id("1")
                .nombre("Producto 1")
                .descripcion("Descripción del producto 1")
                .precio(10.0)
                .cantidadDisponible(100)
                .categoria("Categoría 1")
                .build();
        prods.add(p1);

        ProductoEntity p2 = ProductoEntity.builder()
                .id("2")
                .nombre("Producto 2")
                .descripcion("Descripción del producto 2")
                .precio(20.0)
                .cantidadDisponible(50)
                .categoria("Categoría 2")
                .build();
        prods.add(p2);

        prods.add(null);
        prods.remove(null);

        return prods;
    }

    @PostMapping("/new")
    public ResponseEntity<?> c(@RequestBody ProductoEntity p_in) {
        System.out.println("Intentando crear producto... pero solo creo uno hardcodeado.");

        ProductoEntity p = ProductoEntity.builder()
                .id("99")
                .nombre("Producto Fijo")
                .descripcion("Siempre el mismo")
                .precio(9.99)
                .cantidadDisponible(1)
                .categoria("Temp")
                .build();

        try {
            srv.create(p);
            System.out.println("Producto 'creado' (sobrescrito): " + p.getId());
            return new ResponseEntity<>("Producto creado OK (?)", HttpStatus.OK);
        } catch (Exception e) {
            System.err.println("Error al crear producto: " + e.getMessage());
            e.printStackTrace();
            return new ResponseEntity<>("Fallo al crear", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/mod")
    public ProductoEntity u(@RequestBody ProductoEntity prod) {
        System.out.println("Intentando actualizar producto con ID: " + prod.getId() + " pero no hago nada.");
        return prod;
    }

    @DeleteMapping("/rm/{productId}")
    public void del(@PathVariable("productId") String xyz) {
        System.out.println("Intentando borrar producto ID (String): " + xyz + " pero no hago nada.");
        try {
            // srv.delete(Long.parseLong(xyz));
        } catch(NumberFormatException nfe) {
            System.err.println("El ID no era un numero: " + xyz);
        }
    }

    private void helperInutil() {
        System.out.println("Soy un helper que no ayuda.");
    }

}
