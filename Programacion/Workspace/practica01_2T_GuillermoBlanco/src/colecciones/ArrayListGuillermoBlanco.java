package colecciones;


import java.util.*;

public class ArrayListGuillermoBlanco extends Arboles
{
	public ArrayListGuillermoBlanco() {}
	public ArrayListGuillermoBlanco(String nombre, double altura, int a�osEdad, String lugarOrigen, boolean hojaCaduca)
	{
		super(nombre,altura,a�osEdad,lugarOrigen,hojaCaduca);
	}
	
	public static void main(String[] args) 
	{
		
		
		ArrayList<Arboles> tA=new ArrayList<Arboles>();
		Arboles[] aaT=new Arboles[5];
		
		tA.add(new Arboles("Roble", 12.5, 80, "Canad�", true));
		tA.add(new Arboles("Encina", 5.25, 90, "Espa�a", false));
		tA.add(new Arboles("Pino Laricio", 22.5, 80, "Italia", false));
		tA.add(new Arboles("Roble", 5.5, 15, "Canad�", true));
		tA.add(new Arboles("Manzano", 3.5, 60, "India", false));
		
		if (tA.isEmpty()) 
		{
			System.out.println("Esta vac�o.");
		}
		else {
			aaT=tA.toArray(aaT);
		}
		
		for(Arboles x:aaT)
			System.out.println(x);
		System.out.println(tA);
		
		
		for(Arboles e:tA)
		{
			if(e.getNombre().equals("Peral"))
				System.out.println("El arbol "+e.getNombre()+" de "+e.getLugarOrigen()+" existe");
			if(e.getNombre().equals("Peral")) {
				System.out.println();
			
			}
			
			e.getA�osEdad();
		
			
			
		}
		
		for(Arboles e:aaT) 
		{
			
			for(int i=0;i<tA.size();i++)
				if(e.getNombre().equals("Manzano"))
				{
					tA.remove(i);
				}
				
	
		}
		System.out.println(tA);
		
		Comparator<Integer> comparaAl = Collections.reverseOrder();
		
		System.out.println();
		
		
		
		
		
		
	}
	}
	
	
	

	

