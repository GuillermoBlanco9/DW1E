package ArrayLists;
import java.util.*;
public class AnimalCasero 
{
	private String nombre;
	private double peso;
	private String especie;
	
	
	public AnimalCasero(String nombre, double peso, String especie) {
		this.nombre=nombre;
		this.peso=peso;
		this.especie=especie;
	}


	public static void main(String[] args) 
	{
		ArrayList <AnimalCasero> animal=new ArrayList<>();
		
		animal.add(new AnimalCasero("gato",12.2,"Felino"));
		animal.add(new AnimalCasero("perro",42.2,"C�nido"));
		animal.add(new AnimalCasero("puma",102.2,"Felino"));
		animal.add(new AnimalCasero("elefante",1112.2,"Peptido"));
		animal.add(new AnimalCasero("perro",41.2,"C�nido"));
		animal.add(new AnimalCasero("gato",12.2,"Felino"));
		
		HashSet <AnimalCasero> animalete=new HashSet<>();
	
		animalete.addAll(animal);
		
		System.out.println(animal);
		
		
		System.out.println(animalete);
		
		
	}
	

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalCasero other = (AnimalCasero) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String toString()

	{
		String msj="El animal "+nombre+" de un peso de: "+peso+" y de la especie de: "+especie;
		return msj;
		
		
		
	}
	
}
