package Entidades;

import java.util.Date;

public class Reserva {
    	final int idReserva;
	Date fechaInicio;
	Date fechaFinal;
	Date fechaRegistro;
	int idOperador;

    public Reserva(int idReserva, Date fechaInicio, Date fechaFinal, Date fechaRegistro, int idOperador) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRegistro = fechaRegistro;
        this.idOperador = idOperador;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }
        
     
}
