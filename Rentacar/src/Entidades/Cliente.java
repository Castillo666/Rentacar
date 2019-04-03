package Entidades;


public class Cliente {
        int cedula;
	String nombreCompleto;
	String direccion;
	String correo;
	String telefono;
	//fotoLicencia image not null

    /*public Cliente(int cedula, String nombreCompleto, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    */
        
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
        
        
}
