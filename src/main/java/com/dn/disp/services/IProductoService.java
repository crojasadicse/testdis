package com.dn.disp.services;

import java.util.List;

import com.dn.disp.models.ProductoEntity;

public interface IProductoService {

    // Aquí puedes agregar los métodos y la lógica para manejar las solicitudes relacionadas con productos.
    // Por ejemplo, métodos para crear, leer, actualizar y eliminar productos.
    
    // Ejemplo de método para obtener todos los productos
    public List<ProductoEntity> obtenerTodosLosProductos();
    
    // Ejemplo de método para crear un nuevo producto
    public void crearProducto();
    
    // Otros métodos según sea necesario
    // Ejemplo de método para actualizar un producto existente
     public void actualizarProducto();

    // Ejemplo de método para eliminar un producto existente
    public void eliminarProducto(String id);

    public void obtenerProductoPorId(String id);

}
