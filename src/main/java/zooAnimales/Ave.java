package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int creados;
	
	public Ave(String nom, int edad, String habitat, String genero, String color) {
		setNombre(nom);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorPlumas = color;
		listado.add(this);
		creados++;
	}
	
	public Ave() {
		listado.add(this);
		creados++;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAve() {
		return creados;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		String habitat="montanas";
		String colorPlumas="cafe glorioso";
		Ave a=new Ave(nombre,edad,habitat,genero,colorPlumas);
		halcones++;
		return a;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		String habitat="montanas";
		String colorPlumas="blanco y amarillo";
		Ave a=new Ave(nombre,edad,habitat,genero,colorPlumas);
		aguilas++;
		return a;
	}

}
