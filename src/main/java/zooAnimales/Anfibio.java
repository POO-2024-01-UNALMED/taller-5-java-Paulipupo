package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nom, int edad, String habitat, String genero, String color, boolean veneno) {
		setNombre(nom);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorPiel = color;
		venenoso = veneno;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
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
		return listado.size();
	}

}
