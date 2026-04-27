public abstract class Animal {
    protected  String nombre;
    protected int edad;
    protected String dueno;

    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public abstract double calcularCostoConsulta();

    public void fichaAnimal(){
        System.out.println("nombre" + this.nombre);
        System.out.println("edad" + this.edad);
        System.out.println("dueño" + this.dueno);
        System.out.println("valor de la consulta:" + calcularCostoConsulta());
    }
}

