package gestion;

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

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

    public Zona[] getZona() {
        return zonas;
    }

    public void agregarZonas(Zona zona){
        int n = getZona().length + 1;
        Zona temp[] = new Zona[n];
        for (int i = 0; i < n; i++) {
            temp[i] = getZona()[i];
        }
        temp[n] = zona;
        this.zonas = temp;
    }
    public int cantidadTotalAnimales() {
        int r = 0;
        for (int i = 0; i <= getZona().length; i++) {
            r += getZona()[i].cantidadAnimales();
        }
        return r;
    }
}
