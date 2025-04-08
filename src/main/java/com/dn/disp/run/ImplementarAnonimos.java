package com.dn.disp.run;

import java.util.List;

import com.dn.disp.InterfaceFunctional.IMath;
import com.dn.disp.models.ProductoEntity;


public class ImplementarAnonimos {

    public static void main(String[] args) {

        System.out.println( ProductoEntity.class.getName() );
        System.out.println( String.class.getName() );

        // IMath math = new IMath() {
        //     @Override
        //     public Integer operation(Integer a, Integer b) {
        //         return a + b;
        //     }
        // };

        IMath math = (a, b) -> a + b; // Expresión lambda que implementa la interfaz funcional IMath

        math.operation(5, 10); // Llamada al método operation de la interfaz funcional

        System.out.println(math.getClass().getName()); // Salida: com.dn.disp.run.ImplementarAnonimos$1


        List<String> lista = List.of("uno", "dos", "tres", "cuatro", "cinco");


        lista.forEach( (s) -> System.out.println(s) ); // Imprime cada elemento de la lista

        
        
        
    }

}
