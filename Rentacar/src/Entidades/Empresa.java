package Entidades;


public class Empresa {
        final int cedulaJuridica;
	String razonSocial;
	String telefono;
	int idProvincia;
	int idCanton;
	int idDistrito;
	String señas;

    public Empresa(int cedulaJuridica, String razonSocial, String telefono, int idProvincia, int idCanton, int idDistrito, String señas) {
        this.cedulaJuridica = cedulaJuridica;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.idProvincia = idProvincia;
        this.idCanton = idCanton;
        this.idDistrito = idDistrito;
        this.señas = señas;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public String getSeñas() {
        return señas;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public void setSeñas(String señas) {
        this.señas = señas;
    }
    
    
        
}
