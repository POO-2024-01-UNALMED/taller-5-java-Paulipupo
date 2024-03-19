package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal() {
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public static void setTotalAnimales() {
		totalAnimales++;
	}
	
	public static int getTotalAnimales() {
		return Mamifero.cantidadMamifero()+Ave.cantidadAve()+Reptil.cantidadReptil()+Pez.cantidadPez()+Anfibio.cantidadAnfibio();
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+(Mamifero.cantidadMamifero())+"\n"+
				"Aves: "+(Ave.cantidadAve())+ "\n"+
				"Reptiles: "+(Reptil.cantidadReptil())+"\n"+
				"Peces: " +(Pez.cantidadPez())+ "\n"+
				"Anfibios: "+(Anfibio.cantidadAnfibio());
	}
	
	public String toString(){
		if (zona.size()!=0) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+", y mi genero es "+
				this.genero+", la zona en la que me ubico es "+this.zona.get(0).getNombre()+", en el "+this.zona.get(0).getZoo().getNombre();
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
		}
	}
	
	public String movimiento() {
		return "desplazarse";
	}
}

