package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nom, int edad, String habitat, String genero, boolean pelaje, int patas) {
		setNombre(nom);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero() {
		listado.add(this);
	}
	
	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamifero() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		String habitat="pradera";
		boolean pelaje=true;
		int patas=4;
		Mamifero a=new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
		caballos++;
		return a;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		String habitat="selva";
		boolean pelaje=true;
		int patas=4;
		Mamifero a=new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
		leones++;
		return a;
	}
}
