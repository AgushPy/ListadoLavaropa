/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2herencia.serviceImpl;

import ejercicio2herencia.entidades.Electrodomestico;
import ejercicio2herencia.service.LavaropaService;
import java.util.Scanner;

/**
 *
 * @author agush
 */
public final class Lavaropa extends Electrodomestico implements LavaropaService{

    private int carga;
    Scanner leer = new Scanner(System.in);
    public Lavaropa(){
    }

    public Lavaropa(int carga, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    @Override
    public void crearLavaropa() {
        super.crearElectrodomestico();
        System.out.println("Porfavor indique la cantidad de carga del lavaropa");
        this.carga = leer.nextInt();
    }

    @Override
    public double precioFinal(){
        double valorElectro = super.precioFinal();
        double valorCarga = 500 ;
        if(this.carga >= 30){
            precio = this.precio + valorCarga;
        }
        System.out.println("El precio final de su lavaropa es : "+this.precio);
        return precio;
    }


    
    
    
    
}
