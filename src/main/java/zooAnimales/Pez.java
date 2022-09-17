package zooAnimales;

public class Pez extends Animal{
    private static Pez[] listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        if (listado==null) {
            listado = new Pez[1];
            listado[0] = this;
        } else {
            int n = getListado().length + 1;
            Pez[] temp = new Pez[n];
            for (int i = 0; i < n-1; i++) {
                temp[i] = getListado()[i];
            }
            temp[n-1] = this;
            setListado(temp);
        }
    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static Pez[] getListado() {
        return listado;
    }

    public static void setListado(Pez[] listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces() {
        return getListado().length;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }
    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }
}
