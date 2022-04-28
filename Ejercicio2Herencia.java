package ejercicio2herencia;

import ejercicio2herencia.entidades.Electrodomestico;
import ejercicio2herencia.serviceImpl.Lavaropa;
import ejercicio2herencia.serviceImpl.Television;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2Herencia {
    public static void main(String[] args) {
        Lavaropa l1 = new Lavaropa();
        Lavaropa l2 = new Lavaropa();
        Television tv = new Television();
        Television t2 = new Television();
        List<Electrodomestico> listadoProductos = new ArrayList();
        List<Double> carritoCompra = new ArrayList(); 
        
        l1.crearLavaropa();
        l1.precioFinal();
        l2.crearLavaropa();
        l2.precioFinal();
        
        tv.crearTelevisor();
        tv.precioFinal();
        t2.crearTelevisor();
        t2.precioFinal();
        
        listadoProductos.add(tv);
        listadoProductos.add(t2);
        listadoProductos.add(l1);
        listadoProductos.add(l2);
        
        double valorTotal = 0 ;
        for (Electrodomestico producto : listadoProductos) {
            carritoCompra.add(producto.getPrecio());
            valorTotal = valorTotal + producto.getPrecio();
        }
        
        System.out.println("El valor total de la compra es de : " + valorTotal);
    }
    
}
