//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal1 = new perro("perrillo", 12, "Daniel", "bulldog");
        Animal animal2 = new Gato("gatillo", 2, "pablito", true);
        Animal animal3 = new Ave("periquillo", 4, "Andres", 120);

        animal1.fichaAnimal();
        animal2.fichaAnimal();
        animal3.fichaAnimal();

        ((Vacunable) animal1).registrarVacuna("moquillo");
        ((Vacunable) animal1).registrarVacuna("rabia");
        ((Vacunable) animal2).registrarVacuna("triple felina");
        ((Vacunable) animal2).registrarVacuna("leucemia");

        System.out.println("vacuna perros" + " " + ((Vacunable) animal1).getVacunasAplicadas());

        Asegurable[] asegurables = {(Asegurable) animal1, (Asegurable) animal2, new Clinica("veterinaria", "calle 5")};

        for (Asegurable asegurable : asegurables) {
            System.out.println(asegurable.obtenerNumeroPoliza());
            System.out.println(asegurable.calcularPrimaSeguro());
        }

    }
}
