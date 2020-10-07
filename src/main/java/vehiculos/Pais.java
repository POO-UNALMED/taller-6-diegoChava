package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> listado = new ArrayList<>();
	private List<Fabricante> fabricantes = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	public Pais() {
		listado.add(this);
	}

	//METODOS SET y GET	
	
	public static List<Pais> getListado() {
		return listado;
	}

	public static void setListado(List<Pais> listado) {
		Pais.listado = listado;
	}

	public List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricante Fab) {
		fabricantes.add(Fab);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public static Pais paisMasVendedor() {
		int cont = 0;
		Pais contri = null;
		for (Pais p : listado) {
			if(p.getFabricantes().size()>cont) {
				cont = p.getFabricantes().size();
				contri = p;
			}
		}
		return contri;
	}
}
