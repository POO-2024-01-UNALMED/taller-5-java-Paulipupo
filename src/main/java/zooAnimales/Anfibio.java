package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int creados;
	
	public Anfibio(String nom, int edad, String habitat, String genero, String color, boolean veneno) {
		setNombre(nom);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorPiel = color;
		venenoso = veneno;
		listado.add(this);
		creados++;
	}
	
	public Anfibio() {
		listado.add(this);
		creados++;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static int cantidadAnfibio() {
		return creados;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		String habitat="selva";
		String colorPiel="rojo";
		boolean venenoso=false;
		Anfibio a=new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
		ranas++;
		return a;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		String habitat="selva";
		String colorPiel="negro y amarillo";
		boolean venenoso=false;
		Anfibio a=new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
		salamandras++;
		return a;
	}

}
