package Ejercicios1Ev;

import java.util.ArrayList;



public class Animal extends SerVivo implements Pastillas
{

	String comer="Comida";
	String nombre;
	double altura;
	int edad;
	int patas;
	String claseA,claseP;
	boolean extinc;
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		double altMax=0;
		String nomAnimal="";
		
		
		Animal obj=new Animal();
		Animal obj2=new Animal();
		Animal obj3=new Animal();
		Animal obj4=new Animal();
		
		obj.altura=4;
		obj2.altura=2;
		obj3.altura=4;
		obj4.altura=3;
		
		
		
		
		Animal seres[]=new Animal[4];
		seres[0]=obj;
		seres[1]=obj2;
		seres[2]=obj3;
		seres[3]=obj4;
		
		ArrayList <Animal> gilipollas=new ArrayList <Animal>();
		
	
		
		for(Animal x:seres)
		{
			gilipollas.add(x);
		}
		System.out.println(gilipollas);		

	for(int i=0;i<seres.length;i++)
		if(seres[i].getAltura()>altMax)
		{
			altMax=seres[i].getAltura();
			nomAnimal=seres[i].getNombre();
		}
		System.out.println(nomAnimal+"  "+altMax);
		
	}	
	
	
	
	
	
	
	public String recordarPastilla(String a)
	{
		
		return null;
	}

	
	public String visita(String a, String b) 
	{
		
		return null;
	}

	
	public String comer(String a) 
	{
		String x="Comida";
		return x;
	}

	


	
	public String beber(String b)
	{
		String x="Agua";
		return x;
	}

}
