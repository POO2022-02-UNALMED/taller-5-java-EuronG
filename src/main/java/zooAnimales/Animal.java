package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal extends Zona {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona[] zona;

    public Animal() {
        Animal.totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        Animal.totalAnimales++;
    }
    public static int getTotalAnimales() {
        return Animal.totalAnimales;
    }
    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
    }

    public String movimiento() {
        switch (this.getClass().getSimpleName()) {
            case "Mamifero":{
                return "desplazarse";
            }
            case "Ave":{
                return "volar";
            }
            case "Reptil":{
                return "reptar";
            }
            case "Pez":{
                return "nadar";
            }
            case "Anfibio":{
                return "saltar";
            }
            default: {
                return null;}
            }
        }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
                "Aves: " + Ave.cantidadAves() + "\n" +
                "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
                "Peces: " + Pez.cantidadPeces() + "\n" +
                "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString() {
        if (this.getZona() != null) {
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() +
                    ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() +
                    ", la zona en la que me ubico es " + this.getZona()[0].getNombre() + ", en el zoo " +
                    this.getZona()[0].getZoo().getNombre();
        } else {
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() +
                    ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero();
        }
    }
}
