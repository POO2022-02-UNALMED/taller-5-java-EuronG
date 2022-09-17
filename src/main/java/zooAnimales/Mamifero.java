package zooAnimales;

public class Mamifero extends Animal{
    private static Mamifero[] listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    int patas;

    public Mamifero() {}
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static Mamifero[] getListado() {
        return listado;
    }

    public static void setListado(Mamifero[] listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
}
