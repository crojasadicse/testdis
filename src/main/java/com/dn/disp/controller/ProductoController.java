package com.dn.disp.controller;

import java.util.ArrayList;
import java.util.List;



import com.dn.disp.models.ProductoEntity;
import com.dn.disp.services.IProductoService;



//@AllArgsConstructor
public class ProductoController {

    
    IProductoService iproductoService;

    public ProductoController(IProductoService iproductoService){
        this.iproductoService = iproductoService;
    }

    // Aquí puedes agregar los métodos y la lógica para manejar las solicitudes relacionadas con productos.
    // Por ejemplo, métodos para crear, leer, actualizar y eliminar productos.
    
    // Ejemplo de método para obtener todos los productos
    public List<ProductoEntity> obtenerTodosLosProductos() {
        // Lógica para obtener todos los productos

        List<ProductoEntity> productos = new ArrayList<>();
        productos.add(ProductoEntity.builder()
                .id("1")
                .nombre("Producto 1")
                .descripcion("Descripción del producto 1")
                .precio(10.0)
                .cantidadDisponible(100)
                .categoria("Categoría 1")
                .build());

        productos.add(ProductoEntity.builder()
                .id("2")
                .nombre("Producto 2")
                .descripcion("Descripción del producto 2")
                .precio(20.0)
                .cantidadDisponible(50)
                .categoria("Categoría 2")
                .build());

        return productos;

    }
    
    // Ejemplo de método para crear un nuevo producto
    public void crearProducto() {
        // Lógica para crear un nuevo producto

        ProductoEntity productoEntity = ProductoEntity.builder()
                .id("1")
                .nombre("Producto 1")
                .descripcion("Descripción del producto 1")
                .precio(10.0)
                .cantidadDisponible(100)
                .categoria("Categoría 1")
                .build();
        

    }
    
    // Otros métodos según sea necesario
    // Ejemplo de método para actualizar un producto existente
    public void actualizarProducto() {
        // Lógica para actualizar un producto existente
    }


    // Ejemplo de método para eliminar un producto
    public void eliminarProducto() {
        // Lógica para eliminar un producto

        
    }

}
