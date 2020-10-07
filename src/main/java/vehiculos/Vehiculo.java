package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	public static int cantidadVehiculos;
	 
	//CONTRUCTORES
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		
	}

	// METODOS SET
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setPlaca(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	//METODOS GET
	
	public String getPlaca() {
		return placa;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTraccion() {
		return traccion;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public int getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	//METODOS ADICIONALES
	
	public static String totalPorTipo() {
		return  "Automoviles: " + Automovil.cantidadAutomoviles() +"\n" + 
				"Camionetas: " + Camioneta.cantidadCamionetas() + "\n" +
				"Camiones: " + Camion.cantidadCamiones(); 
				
	}
	
}