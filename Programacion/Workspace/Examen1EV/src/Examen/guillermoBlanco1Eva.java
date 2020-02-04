package Examen;

import java.time.LocalDate;
import java.util.*;

public class guillermoBlanco1Eva extends Trabajador implements CalculadorNominaInterface
{
	private String funcion,especialidad;
	
	public guillermoBlanco1Eva() {}
	
	public guillermoBlanco1Eva(String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, String ciudad, String pais, double sueldoBruto, double porcientoIrpf, double porcientoSSocial)
	{
		super(nombre,fechaNacimiento,fechaAlta,ciudad,pais,sueldoBruto,porcientoIrpf,porcientoSSocial);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		
		
		System.out.println("�Cuantos profesionales desea dar de alta? teclee a continuaci�n: ");
		Scanner teclado=new Scanner(System.in);
		int numProf=teclado.nextInt();
		
		
		Trabajador jobs[]=new Trabajador[numProf];
		ArrayList <Trabajador> listaM=new ArrayList <Trabajador>();
		ArrayList <Trabajador> listaE=new ArrayList <Trabajador>();
		ArrayList <Trabajador> listaD=new ArrayList <Trabajador>();
		LocalDate fechaNacimiento=null;
		LocalDate fechaAlta=null;
		
		for(int i=0;i<numProf;i++)
		{
			
			System.out.println("Introduzca los siguientes datos del profesional: ");
			System.out.println("Nombre: ");
			String nombre=teclado.next();
			System.out.println("Fecha de nacimiento: ");
			String cuerda;
			cuerda=teclado.next();
			try
			{
				fechaNacimiento=LocalDate.parse(cuerda);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Fecha alta en la empresa: ");
			String cuerda2=teclado.next();
			try
			{
				fechaAlta=LocalDate.parse(cuerda2);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Pa�s: ");
			String pais=teclado.next();
			System.out.println("Ciudad: ");
			String ciudad=teclado.next();
			System.out.println("Sueldo Bruto: ");
			double sueldoBruto=teclado.nextDouble();
			System.out.println("Porcentaje IRPF: ");
			double porcientoIrpf=teclado.nextDouble();
			System.out.println("Porcentaje Seguridad Social: ");
			double porcientoSSocial=teclado.nextDouble();
			
			System.out.println("Funcion( teclee (M)edico, (E)enfermero, (O)tra");
			String funcion=teclado.next();
			switch (funcion) {
			case "M":
				
				jobs[i]=new Trabajador(nombre,fechaNacimiento,fechaAlta,pais,ciudad,sueldoBruto,porcientoIrpf,porcientoSSocial);
				for(Trabajador x:jobs)
					listaM.add(x);
				
				
				
				break;
			case "E":
				
				
				jobs[i]=new Trabajador(nombre,fechaNacimiento,fechaAlta,pais,ciudad,sueldoBruto,porcientoIrpf,porcientoSSocial);
				for(Trabajador x:jobs)
					listaE.add(x);
				
				
				
			
				break;
			case "O":
				
				jobs[i]=new Trabajador(nombre,fechaNacimiento,fechaAlta,pais,ciudad,sueldoBruto,porcientoIrpf,porcientoSSocial);
				for(Trabajador x:jobs)
					listaD.add(x);
				
				
			
				break;

			default:
				break;
				
				
				
			}
			
			//System.out.println("Especialidad Medica(Oftalmologo, UVI, Internista, Traumatologo, cirugia)"
			//		+ "\nEnfermeria(quirofano, uvi, urgencias, planta) Otra:");
			//String especialidad=teclado.next();
			
			
		}
		
				teclado.close();	
				
				System.out.println("Informacion del personal de enfermeria: ");
				System.out.println("=======================================");
			
			for(Trabajador b:listaE)
			{
				
				System.out.println(b.toString());
			}
			
			System.out.println("Informacion del personal con otra funcion: ");
			System.out.println("=======================================");
			
			for(Trabajador o:listaD)
			{
				
				System.out.println(o.toString());
			}
			
			System.out.println("Informacion del personal medico: ");
			System.out.println("=======================================");
			
			for(Trabajador r:listaM)
			{
				
				
				System.out.println(r.toString());
			}
			
			
			
			
		
		

	}

	
	public double calculoIRPF() {
		
		return 0;
	}

	
	public double calculoSSocial() {
		
		return 0;
	}

	
	public double calculoSueldoNeto(double a, double b) {
		
		double c=(a/100*b);
		c=(double)Math.round(c*100)/100;
		return c;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
}
