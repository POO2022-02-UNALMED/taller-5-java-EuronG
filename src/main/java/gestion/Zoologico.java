package gestion;

import zooAnimales.Mamifero;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;

    public Zoologico() {

    }
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setZona(Zona[] zonas) {
        this.zonas = zonas;
    }

    public Zona[] getZona() {
        return zonas;
    }



    public void agregarZonas(Zona zona){
        if (zonas==null) {
            zonas = new Zona[1];
            zonas[0] = zona;
        } else {
            int n = getZona().length + 1;
            Zona[] temp = new Zona[n];
            for (int i = 0; i < n - 1; i++) {
                temp[i] = getZona()[i];
            }
            temp[n - 1] = zona;
            this.zonas = temp;
        }
    }
    public int cantidadTotalAnimales() {
        int r = 0;
        for (int i = 0; i < getZona().length; i++) {
            r += getZona()[i].cantidadAnimales();
        }
        return r;
    }
}
