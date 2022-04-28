package ejercicio2herencia.entidades;

import java.util.Scanner;

public abstract class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico(){
    
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    protected double comprobarConsumoDeEnergia(char condicion){
        double valorEnergia;
        switch(condicion){
            case 'A':
                return valorEnergia = 1000;
            case 'B':
                return valorEnergia = 800;
            case 'C':
                return valorEnergia = 600;
            case 'D':
                return valorEnergia = 500;
            case 'E':
                return valorEnergia = 300;
            case 'F':
                return valorEnergia = 100;
        }
        return 0;
    }
    
    protected void comprobarColor(String color){
        switch(color){
            case "rojo":
                this.color="rojo";
                break;
            case "blanco":
                this.color="blanco";
                break;
            case "negro":
                this.color="rojo";
                break;
            case "azul":
                this.color="azul";
                break;
            case "gris":
                this.color="gris";
                break;
            default:
                this.color="blanco";
                break;
        }
    }
    
    protected double comprobarPeso(double peso){
        if(peso >=1 || peso <= 19){
            return 100;
        }
        if(peso >=20 || peso <= 49){
            return 500;
        }
        if(peso >=50 || peso <= 79){
            return 800;
        }
        if(peso >= 80){
            return 1000;
        }
        return 0;
    }
    
    protected void crearElectrodomestico(){
        System.out.println("Porfavor ingrese la informacion del electrodomestico");
        System.out.println("Indique su peso");
        this.peso = leer.nextDouble();
        System.out.println("Indique su tipo de consumor energetico del A al F");
        this.consumoEnergetico = leer.next().charAt(0);
        System.out.println("Indique su color");
        this.color = leer.next();
        this.precio = 1000;
        
    }
    
    protected double precioFinal(){
        double valor1 = this.comprobarConsumoDeEnergia(this.consumoEnergetico);
        double valor2 = this.comprobarPeso(this.peso);
        
        this.precio = precio + valor1 + valor2;
        
        return this.precio;
    }
    
    
}
