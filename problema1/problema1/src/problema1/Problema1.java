/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
class terreno{
    private double costo_terreno;
    private double ancho_terreno;
    private double largo_terreno;
    private double area_terreno;
    private double valorMetroCuadrado;
    public terreno(){}
    public terreno(double ancho_terreno, 
            double largo_terreno, 
            double valorMetroCuadrado){
        this.ancho_terreno = ancho_terreno;
        this.largo_terreno = largo_terreno;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public void setAncho(double ancho_terreno){
        this.ancho_terreno = ancho_terreno;
    }
    public void setLargo(double largo_terreno){
        this.largo_terreno = largo_terreno;
    }
    public void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
      public void calcularAreaTerreno(){
        this.area_terreno = this.largo_terreno*this.ancho_terreno;
    }
     public void calcularCostoTerreno(){
        this.costo_terreno = this.area_terreno*this.valorMetroCuadrado;
    }
    public double getCosto_Terreno(){
        return this.costo_terreno;
    }
     public double getAncho(){
        return this.ancho_terreno;
    }
     public double getLargo(){
        return this.largo_terreno;
    }
     public double getArea(){
        return this.area_terreno;
    }
     public double getValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }
     
    @Override
     public String toString(){
         String msj = String.format("DATOS DE TERRENO "
                 + "\nAncho del Terreno %.2f "
                 + "\nLargo del Terreno %.2f "
                 + "\nValor metro cuadrado del Terreno %.2f "
                 + "\nValor del area %.2f "
                 + "\nValor del terreno %.2f ",
                 this.getAncho(),this.getLargo(),
                 this.getValorMetroCuadrado(),this.getArea(),
                 this.getCosto_Terreno());
         return msj;
     }
}


public class Problema1 {

    public static void main(String[] args) {
        terreno terreno1 = new terreno(10,2,2);
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
    }
    
}
