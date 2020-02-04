package practica1;

import java.util.*;

public class HashSetGuillermoBlanco 
{

	public static void main(String[] args) 
	{
		HashSet<Arboles> hs=new HashSet<Arboles>();
		
		hs.add(new Arboles("Roble", 12.5, 80, "Canad�", true));
		hs.add(new Arboles("Encina", 5.25, 90, "Espa�a", false));
		hs.add(new Arboles("Pino Laricio", 22.5, 80, "Ihslia", false));
		hs.add(new Arboles("Roble", 5.5, 15, "Canad�", true));
		hs.add(new Arboles("Manzano", 3.5, 60, "India", false));
		
		System.out.println("El tama�o del HashSet es: "+hs.size());
		System.out.println("");
		System.out.println("");
		
		Arboles[] ar= new Arboles[hs.size()];
		if(hs.size()>0)
		ar=hs.toArray(ar);
		
		System.out.println("Listo el array");
		System.out.println("==============");
		System.out.println("");
		for(Arboles e:ar)
		{
			
			System.out.println(e);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Listo el HashSet");
		System.out.println("==============");
		System.out.println("");
		for(Arboles e:hs)
		{
			
			System.out.println(e);
		}
		
	}

	
	}


