package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo[0]=zoo;
	}
	
	public Zona() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

}
