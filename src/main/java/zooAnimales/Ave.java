package zooAnimales;

public class Ave extends Animal{
    private static Ave[] listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave() {}
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave[] getListado() {
        return listado;
    }

    public static void setListado(Ave[] listado) {
        Ave.listado = listado;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves() {
        return halcones + aguilas;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
}
