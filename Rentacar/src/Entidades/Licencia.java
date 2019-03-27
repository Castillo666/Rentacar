
package Entidades;

import java.util.Date;

public class Licencia {
    	final int cedula;
	Date fechaEmision;
	String tipo;
	Date fechaExpiracion;
	//image fotoLicencia;

    public Licencia(int cedula, Date fechaEmision, String tipo, Date fechaExpiracion) {
        this.cedula = cedula;
        this.fechaEmision = fechaEmision;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCedula() {
        return cedula;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
        
        
}
