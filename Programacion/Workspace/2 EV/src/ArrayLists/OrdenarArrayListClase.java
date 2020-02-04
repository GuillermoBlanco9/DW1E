package ArrayLists;

import java.util.*;

public class OrdenarArrayListClase
{

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> miAL = new ArrayList <Integer>();
		ArrayList<String> miALS=new ArrayList <String>();
		ArrayList <Coche> miALC=new ArrayList<Coche>();
		
		
		miAL.add(9);
		miAL.add(0);
		miAL.add(8);
		miAL.add(100);
		miAL.add(2);
		miAL.add(13);

		Collections.sort(miAL);
		
		System.out.println(miAL);				
		
		miALS.add("Ruba");
		miALS.add("Migule");
		miALS.add("Pelota");
		miALS.add("El luismi");
		miALS.add("La laura giourninu");
		
		Collections.sort(miALS);
		
		System.out.println(miALS);
	
		Comparator<Integer> comp= Collections.reverseOrder(); 
		
		Collections.sort(miAL,comp);
		
		System.out.println(miAL);
		
		Comparator<String> compS= Collections.reverseOrder();
		
		Collections.sort(miALS,compS);
		
		System.out.println(miALS);
		
		//arraylist de coches ordenar por precio
		
		miALC.add(new Coche("Mercedes",70000.40,"Rojo"));
		miALC.add(new Coche("Hyundai",14000.10,"Gris"));
		miALC.add(new Coche("Dacia",10000.11,"Blanco"));
		miALC.add(new Coche("Mustang",12000.12,"Rojo"));
		miALC.add(new Coche("BMW",42000.13,"Verde"));
		miALC.add(new Coche("Seat",400.15,"Rojo"));
		
		
		
		
		
	}
	

}

class Coche implements Comparable<Coche>

{
	
	private String marca;
	private double precio;
	private String color;
	
	public Coche (String marca, double precio, String color)
	{
		this.marca=marca;
		this.precio=precio;
		this.color=color;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	public int compareTo(Coche c) {
		
		return precio.compareTo(c.getPrecio());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
																