package ar.edu.unq.po2.tp6.Banco;

public class Cliente {

	
	//Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	private double saldo;
	
	
	
	//Metodos
	public void solicitarCredito(Banco banco, Solicitud solicitud) {
		banco.registrarSolicitud(solicitud);
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}
	public void setSueldoNetoAnual(double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//TODO: Posiblemente inseguro el poder setear tu saldo a voluntad. FEO.
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	
	
	
}
