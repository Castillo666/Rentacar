package Entidades;


public class Empresa {
        int cedulaJuridica;
	String razonSocial;
	String telefono;
	int idProvincia;
	int idCanton;
	int idDistrito;
	String señas;

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

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
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
