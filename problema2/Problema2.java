package problema2;

class EquivalenteHora {
    //atributos
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    //costucto
    public EquivalenteHora(double horas){
        this.horas = horas;
    }
    //establecer - set
    public void setCalcularMinutos() {
        this.minutos = this.horas * 60;
    }
    public void setCalcularSegundos() {
        this.segundos = this.horas * 3600;
    }
    public void setCalcularDias() {
        this.dias = this.horas /24;
    }
    //obtener - get
    public double getHoras(){    
        return this.horas;
    }
    public double getMinutos() {    
        return this.minutos;
    }
    public double getSegundos() {
        return this.segundos;
    }
    public double getDias() {
        return this.dias;
    }
    public String toString(){
        String msj = String.format("         Equivalente en Horas"
                +"\n-------------------------------------"
                + "\nCantidad de HORAS Ingresadas: %.2f"
                + "\nEquivalente de horas a MINUTOS es: %.2f"
                + "\nEquivalente de horas a SEGUNDOS es: %.2f"
                + "\nEquivalente de horas a DIAS es: %.2f", this.getHoras(),
                 this.getMinutos(),this.getSegundos(),this.getDias()); 
        return msj;
    }
}

public class Problema2 {

    public static void main(String[] args) {
        
        EquivalenteHora equivalenteHora = new EquivalenteHora(72);

        equivalenteHora.setCalcularMinutos();
        equivalenteHora.setCalcularSegundos();
        equivalenteHora.setCalcularDias();
        System.out.println(equivalenteHora);
        
    }
}