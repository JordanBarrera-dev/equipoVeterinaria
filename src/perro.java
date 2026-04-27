import java.util.ArrayList;
import java.util.List;

public class perro extends Animal implements Vacunable, Asegurable{

    private String raza;
    private List <String> vacunas = new ArrayList<>();

    public perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
    }

    @Override

    public double calcularCostoConsulta(){
        return (3000 * edad) + 45000;
    }
    public double calcularPrimaSeguro(){
        return (80000 * edad);
    }
    //el nombre es de la vacuna no del animal
    public void registrarVacuna(String nombre){
        vacunas.add(nombre);
    }
    public int getVacunasAplicadas(){
        return  vacunas.size();
    }
    @Override
    public String obtenerNumeroPoliza() {
        return "POL-perro" + nombre;
    }
}
