package zooAnimales;

public class Anfibio extends Animal{
    private static Anfibio[] listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {}
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static Anfibio[] getListado() {
        return listado;
    }

    public static void setListado(Anfibio[] listado) {
        Anfibio.listado = listado;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public static int cantidadAnfibios() {
        return ranas+salamandras;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
}
