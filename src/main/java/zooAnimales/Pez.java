package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nom, int edad, String habitat, String genero, String color, int aletas) {
		setNombre(nom);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorEscamas = color;
		cantidadAletas = aletas;
		listado.add(this);
	}
	
	public Pez() {
		listado.add(this);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPez() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		String habitat="oceano";
		String colorEscamas="rojo";
		int cantidadAletas=6;
		Pez a=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		salmones++;
		return a;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		String habitat="oceano";
		String colorEscamas="gris";
		int cantidadAletas=6;
		Pez a=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		bacalaos++;
		return a;
	}

}
