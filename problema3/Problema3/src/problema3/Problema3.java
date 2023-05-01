package problema3;

class AdministrarInstitucionesEducativas{
    //atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadoEstudiante;
    private double presupuesto;
    public AdministrarInstitucionesEducativas(){}
    //constructor
    public AdministrarInstitucionesEducativas(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadoEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadoEstudiante = gastosProyectadoEstudiante;
    }
    //set - establecer
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlumnos){
        this.numeroAlumnos = numeroAlumnos;
    }
    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    public void setGastosProyectadoEstudiante(double gastosProyectadoEstudiante) {
        this.gastosProyectadoEstudiante = gastosProyectadoEstudiante;
    }
    //calcular presupuesto
    public void calcularPresupuesto(){
        this.presupuesto = this.gastosProyectadoEstudiante * this.numeroAlumnos ;
    }
    //get - obtener
    public double getPresupuesto() {
        return this.presupuesto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }
    public int getNumeroAlumnos() {
        return this.numeroAlumnos;
    }
    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }
    public int getNumeroSedes() {
        return this.numeroSedes;
    }
    public double getGastosProyectadoEstudiante() {
        return this.gastosProyectadoEstudiante;
    }
    //presentar
    public String toString(){
        String msj = String.format("        DATOS DE LA INSTITUCION EDUCATIVA "
                +"\n-------------------------------------------------"
                +" \nNombre de la Institucion Educativa: %s"
                +" \nTipo de Institucion Educativa: %s"
                +" \nNumero de Alumnos: %d" 
                +" \nNumero de Docentes: %d"
                +" \nNumero de Sedes: %d"
                +"\nGastos Proyectado por Estudiante: %.2f"
                + "\nPresupuesto: %.2f", this.getNombre(), this.getTipoInstitucion(),
                this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(),
                this.getGastosProyectadoEstudiante(), this.getPresupuesto());
        return msj;
    }  
}

public class Problema3 {
    public static void main(String[] args) {
        
        //String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadoEstudiante
        AdministrarInstitucionesEducativas institucionEducativa1 = new AdministrarInstitucionesEducativas("COMIL-5",
        "Publica",450,100,3,60);
        institucionEducativa1.calcularPresupuesto();
        System.out.println(institucionEducativa1);
    }
}