
public class TiposJava 
{
	

	public static void main(String[] args) 
	{
		
		
		/*
		int milista[]=new int[50];
		
		char miListaCaracter[]=new char[10];
		primera forma de arraig
		milista[0]=100;
		milista[1]=200;
		milista[2]=300;
		milista[3]=400;
		milista[4]=500;
		milista[5]=600;
		*/
		
		//segunda forma de arraig
		//int milista2[]= {100,200,300,400,500,600};
		
		//tercera forma de arraig con un criterio
//-----------------------------------------------------------------------------------------------
		
	
	
		/*
		int primero=202;
			for(int i=0;i<milista.length;i++)
			{
			milista[i]=primero;
			primero+=2;
			//System.out.println(primero);
			}
			for(int i=0;i<50;i++)
				System.out.println(milista[i]);
			System.out.println("****");
			System.out.println("el numero 26 es "+milista[25]+" y el numero 39 es "+milista[40]);
			System.out.println(milista.length);
		*/
			
//------------------------------------------------------------------------------------------------
		/*
		for(int i=0;i<26;i++)
		{
			milista[i]=primero;
			primero++;
			
		}
		
		
		for(int i=0;i<26;i++)
			System.out.println(milista[i]);
		*/
//------------------------------------------------------------------------------------------------
		
		/*
		int primero=202;
		int i=0;
			while (i<milista.length)
			{
				
				milista[i]=primero;
				primero+=2;
				i++;
				
			}
		*/
//----------------------------------------------------------------------------------------------------		------------
		
		/*
		int primero=202;
		int i=0;
		do
		{
			milista[i]=primero;
			primero+=2;
			i++;
			
		}while(i<milista.length);
			for(int v:milista)//El tipo de la variable tiene que ser igual que el del array
				System.out.println(v);
			
			for(i=44;i<milista.length;i++)
				System.out.println(milista[i]);
		*/
//------------------------------------------------------		-------------------------		
			
		persona obj1=new persona();
		persona obj2=new persona();
		persona obj3=new persona();
		persona obj4=new persona("felipe",2100.80,false);
		persona obj5=new persona("Marisa",1100.80,true,"jefa");

	
		
		obj1.nombre="Josefa";
		obj1.sueldo=1500.60;
		obj1.casado=false;
		
		obj2.nombre="Pedro";
		obj2.sueldo=1200.20;
		obj2.casado=true;
		
		obj3.nombre="Cecilio G";
		obj3.sueldo=3500.70;
		obj3.casado=true;
		
		persona listaPersonas[]=new persona[5];
		
		
		listaPersonas[0]=obj1;
		listaPersonas[1]=obj2;
		listaPersonas[2]=obj3;
		listaPersonas[3]=obj4;
		listaPersonas[4]=obj5;
		
		for(persona people:listaPersonas)
			System.out.println("Su nombre es "+people.getNombre() +", tiene un sueldo de: "+people.sueldo+" y "+people.getEC());
	}
	

}
class persona
{
	public String nombre;
	public double sueldo;
	public boolean casado;
	public persona() {};

	public persona(String nombre, double sueldo, boolean casado,String cargo)
	
	{
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.casado=casado;
		System.out.println(cargo);
		
	}
	public persona(String nombre, double sueldo, boolean casado)
	{
		
		
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.casado=casado;
		
		
	}
	
	
	
	public String getNombre()
	{
		return nombre;
		
	}
	
	public String getEC()
	{
		if(casado)
		{
			return "est� casado";
		}
		else {return "est� soltero";}
		
	}
	
	
}


