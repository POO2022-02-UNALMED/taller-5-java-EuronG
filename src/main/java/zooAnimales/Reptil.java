package zooAnimales;

public class Reptil extends Animal{
    private static Reptil[] listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        if (listado==null) {
            listado = new Reptil[1];
            listado[0] = this;
        } else {
            int n = getListado().length + 1;
            Reptil[] temp = new Reptil[n];
            for (int i = 0; i < n-1; i++) {
                temp[i] = getListado()[i];
            }
            temp[n-1] = this;
            setListado(temp);
        }
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static Reptil[] getListado() {
        return listado;
    }

    public static void setListado(Reptil[] listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return getListado().length;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);

    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
}
