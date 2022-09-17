package gestion;
import zooAnimales.Animal;
public class Zona extends Zoologico {
    private String nombre;
    private Zoologico[] zoo;
    private static Animal[] animales;

    public Zona() {

    }
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = new Zoologico[1];
        this.zoo[0] = zoo;
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo[0];
    }

    public void setZoo(Zoologico[] zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }


    public void agregarAnimales(Animal animal){
        int n = getAnimales().length + 1;
        Animal temp[] = new Animal[n];
        for (int i = 0; i < n; i++) {
            temp[i] = getAnimales()[i];
        }
        temp[n] = animal;
        Zona.animales = temp;
    }

    public int cantidadAnimales(){
        return getAnimales().length;
    }

}
