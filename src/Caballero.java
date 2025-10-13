public class Caballero {
    String nombre;
    String constelacion;
    String dios;
    int cosmos;
    Armadura armadura;

    public Caballero(String nombre, String constelacion, String dios, int cosmos, Armadura armadura) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.dios = dios;
        this.cosmos = cosmos;
        this.armadura = armadura;
    }

    public String toString() {
        return nombre + " de " + constelacion + " (Dios: " + dios + ", Cosmos: " + cosmos + ", Armadura: " + armadura.name + ")";
    }
}
