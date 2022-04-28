/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2herencia.serviceImpl;

import ejercicio2herencia.entidades.Electrodomestico;
import ejercicio2herencia.service.television;
import java.util.Scanner;

/**
 *
 * @author agush
 */
public final class Television extends Electrodomestico implements television{
    private int pulgadas;
    private boolean sintTDT;
    Scanner leer = new Scanner(System.in);
       
    
    public Television() {
    }

    public Television(int pulgadas, boolean sintTDT, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintTDT = sintTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
    
    @Override
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Porfavor introduzca los pixeles del tv");
        this.pulgadas = leer.nextInt();
        System.out.println("tiene sintonizador TDT? (contestar con 'si' o con 'no')");
        String rta = leer.next();
        switch(rta){
            case "si":
                this.sintTDT = true;
                break;
            case "no":
                this.sintTDT = false;
                break;
        }
    }
    
    
    @Override
    public double precioFinal(){
        super.precioFinal();
        double precioPorPulgada;
        if(this.pulgadas > 39){
            precioPorPulgada = precio * 0.3;
            this.precio = this.precio + precioPorPulgada;
        }
        if(isSintTDT()){
            this.precio = this.precio + 500;
        }
        System.out.println("El precio de su television es de : "+this.precio);
        return precio;
    }
    
    
}
