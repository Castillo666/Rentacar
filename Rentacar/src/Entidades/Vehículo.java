package Entidades;

public class Vehículo {
    	final String placa; 
	int añoFabricacion;
	String color;
	String marca;
	int capacidad;
	int kilometraje;
	int numeroPuertas;
	String vin;
	int mpg;
	int costoDia;
	int capacidadMaletas;
	String transmicion;
	String sede;
	String estilo;
	String estado;
	int idServicio;

    public Vehículo(String placa, int añoFabricacion, String color, String marca, int capacidad, int kilometraje, int numeroPuertas, String vin, int mpg, int costoDia, int capacidadMaletas, String transmicion, String sede, String estilo, String estado, int idServicio) {
        this.placa = placa;
        this.añoFabricacion = añoFabricacion;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.numeroPuertas = numeroPuertas;
        this.vin = vin;
        this.mpg = mpg;
        this.costoDia = costoDia;
        this.capacidadMaletas = capacidadMaletas;
        this.transmicion = transmicion;
        this.sede = sede;
        this.estilo = estilo;
        this.estado = estado;
        this.idServicio = idServicio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getVin() {
        return vin;
    }

    public int getMpg() {
        return mpg;
    }

    public int getCostoDia() {
        return costoDia;
    }

    public int getCapacidadMaletas() {
        return capacidadMaletas;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getEstado() {
        return estado;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public void setCostoDia(int costoDia) {
        this.costoDia = costoDia;
    }

    public void setCapacidadMaletas(int capacidadMaletas) {
        this.capacidadMaletas = capacidadMaletas;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
       
        
        
}
