public abstract class Clinica implements Asegurable {

    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public double calcularCostoPrima(){
    return 5000000;
     }
     public String obtenerNumeroPoliza(){
        return "POL-CLINICA" + nombre;
     }

}