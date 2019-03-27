package Entidades;


public class Factura {
        final int numeroFactura;
	int placaVehiculo;
	int cedulaCliente;
	int monto;

    public Factura(int numeroFactura, int placaVehiculo, int cedulaCliente, int monto) {
        this.numeroFactura = numeroFactura;
        this.placaVehiculo = placaVehiculo;
        this.cedulaCliente = cedulaCliente;
        this.monto = monto;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getPlacaVehiculo() {
        return placaVehiculo;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setPlacaVehiculo(int placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }       
}
