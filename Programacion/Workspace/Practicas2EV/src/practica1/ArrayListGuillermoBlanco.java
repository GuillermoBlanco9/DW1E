package practica1;


import java.util.*;

public class ArrayListGuillermoBlanco extends Arboles implements Comparable<Arboles>
{
	public ArrayListGuillermoBlanco() {}
	public ArrayListGuillermoBlanco(String nombre, double altura, int añosEdad, String lugarOrigen, boolean hojaCaduca)
	{
		super(nombre,altura,añosEdad,lugarOrigen,hojaCaduca);
	}
	
	public static void main(String[] args) 
	{
		boolean nom=false;
		int edad=0;
		int cam=0;
		
		ArrayList<Arboles> tA=new ArrayList<Arboles>();
		Arboles[] aaT=new Arboles[5];
		
		tA.add(new Arboles("Roble", 12.5, 80, "Canadá", true));
		tA.add(new Arboles("Encina", 5.25, 90, "España", false));
		tA.add(new Arboles("Pino Laricio", 22.5, 80, "Italia", false));
		tA.add(new Arboles("Roble", 5.5, 15, "Canadá", true));
		tA.add(new Arboles("Manzano", 3.5, 60, "India", false));
		
		if (tA.isEmpty()) 
		{
			System.out.println("Esta vacío.");
		}
		else {
			aaT=tA.toArray(aaT);
		}
		
		for(int i=0;i<tA.size();i++)
		{
			
			if(tA.get(i).getNombre() == "Peral" && tA.get(i).getLugarOrigen() == "Canadá")
				 nom = true;
			 if(tA.get(i).getAltura() == 3.5)
				 cam = i;
			 if(tA.get(i).getNombre() == "Encina")
				 tA.get(i).setAñosEdad(95);
			 if(tA.get(i).getNombre() == "Encina" && tA.get(i).getAñosEdad() == 95)
				 edad = 1;
		
		}
		
		
		
		
		tA.removeIf(n  ->(n.getNombre()=="Roble" && n.isHojaCaduca()==true ));
		
		tA.trimToSize();
		Comparator<Arboles> cR = Collections.reverseOrder();
		 Collections.sort(tA, cR);
		
		if(nom)
			System.out.println("* El árbol Peral de lugar de origen Canadá, existe.");
		else
			System.out.println("* El árbol Peral de lugar de origen Canadá, no existe.");
		
		 System.out.println("* La posición del árbol de 3.5 de alto está en la posición: " +cam);
		
		 if(edad==1)
			 System.out.println("* Edad de encinas de 90 años se han cambiado a 95.");
		 else
			 System.out.println("* Edad de encinas de 90 años no se han cambiado a 95.");
		 
		 System.out.println("* Se ha borrado el Roble de hoja caduca");
		System.out.println("");
		System.out.println("");
			System.out.println("Listo Array");
			System.out.println("===============");
			System.out.println("");
			
		for(Arboles x:aaT)
		{
			
			
		
			
			System.out.println(x);
		}
		
		System.out.println("Listo ArrayList");
		System.out.println("===============");
		System.out.println("");
		
		for(Arboles y:tA)
		{
			
			
			System.out.println(y);
		}
	}

	}
	
	
	

	

