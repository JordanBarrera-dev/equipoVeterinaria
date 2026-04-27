public class Clinica implements Asegurable {

    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

     public String obtenerNumeroPoliza(){
        return "POL-CLINICA" + nombre;
     }
     public double calcularPrimaSeguro(){
        return 5000000;
     };

}