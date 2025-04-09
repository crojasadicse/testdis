package com.dn.disp.InterfaceFunctional;

@FunctionalInterface
public interface IMath {

    Integer operation(Integer x, Integer y);

    default void printResult(Integer res) {
        System.out.println("El resultado es: "+res);
    }

}
