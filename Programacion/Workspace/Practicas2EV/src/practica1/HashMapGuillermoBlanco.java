package practica1;

import java.util.*;

public class HashMapGuillermoBlanco 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		String naci="Polaca";
		HashMap <Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1,"Maria Salomea Sklodowska");
		hm.put(2, "Santiago Ram�n y Caja");
		hm.put(3,"T�ano de Crotona");
		hm.put(4,"Mariano Barbacid");
		hm.put(5,"Augusta Ada Byron");
		
		
		Iterator prueba= hm.entrySet().iterator();
		
		for(int i=0;i<4;i++)
			{	switch(i)
			{
			case 1:
				naci="Polaca";
			
			
			
			
			}
		
			}
		for(int i=0;i<4;i++)
		{
			
			HashMap.Entry e = (HashMap.Entry)prueba.next();
			
			if(e.getKey().equals(1))
				System.out.println("Posici�n: 1. Nombre: "+e.getValue()+". Nacionalidad: polaca");
			if(e.getKey().equals(2))
				System.out.println("Posici�n: 2. Nombre: "+e.getValue()+". Nacionalidad: Espa�ola");
			if(e.getKey().equals(3))
				System.out.println("Posici�n: 3. Nombre: "+e.getValue()+". Nacionalidad: Griega");
		}
		System.out.println("Impresi�n del HashMap completo");
		System.out.println("===============================");
		
		prueba=hm.entrySet().iterator();
		while(prueba.hasNext())
		{
			@SuppressWarnings("unchecked")
			HashMap.Entry<Integer, String> e = (HashMap.Entry)prueba.next();
			if(e.getValue().equals("Mariano Barbacid"))
				e.setValue("Margarita Salas Falgueras");
			System.out.println("Posici�n: "+e.getKey()+" *** Nombre: "+e.getValue());
		}
		
		
	}
	

}
