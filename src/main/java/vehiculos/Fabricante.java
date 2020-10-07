package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private static List<Fabricante> listado = new ArrayList<>();
	
	//CONSTRUCTORES
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.setFabricantes(this);
		listado.add(this);
	}
	public Fabricante() {
		listado.add(this);
	}
	
	//METOODOS SET
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static List<Fabricante> getListado() {
		return listado;
	}

	public static void setListado(List<Fabricante> listado) {
		Fabricante.listado = listado;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	//METODOS GET
	
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}

	public static Fabricante fabricaMayorVentas() {
		int cont = 0;
		Fabricante F = null;
		for (Fabricante Fa : listado) {
			if (Fa.getListado().size()>cont) {
				cont = Fa.getListado().size();
				F = Fa;
			}
		}
		return F;
	}
	
}
