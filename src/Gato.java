import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private List<String> vacunas = new ArrayList<>();

    public Gato(String nombre, int edad, String dueno, boolean esEsterilizado) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta(){
        return 38000;
    }

    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }
    public double calcularPrimaSeguro(){
        return esEsterilizado ? 120000: 200000;
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
        return "POL-gato" + nombre;
    }
}
