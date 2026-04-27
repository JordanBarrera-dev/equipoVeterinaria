public class Ave extends Animal{

    private double pesoGramos;

    public Ave(String nombre, int edad, String dueno, double pesoGramos) {
        super(nombre, edad, dueno);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }
    @Override
    public double calcularCostoConsulta(){
        return (pesoGramos * 500) + 28000;
    }
}
