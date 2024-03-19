package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nom, String ubi) {
		nombre = nom;
		ubicacion = ubi;
	}
	
	public Zoologico() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public int cantidadTotalAnimales() {
		/* Retorna la cantidad de animales en el zoologico */
		int cantidadTotalA = 0;
		for(int i = 0; i < zonas.size(); i++) {
			cantidadTotalA += zonas.get(i).cantidadAnimales();
		}
		return cantidadTotalA;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

}
