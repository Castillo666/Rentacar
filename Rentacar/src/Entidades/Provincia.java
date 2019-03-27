package Entidades;

public class Provincia {
        final int idCanton;
        String Nombre;

    public Provincia(int idCanton, String Nombre) {
        this.idCanton = idCanton;
        this.Nombre = Nombre;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
        
        
}
