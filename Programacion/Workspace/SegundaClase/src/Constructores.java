import java.util.Scanner;

public class Constructores
{
	
				
		
	
	public static void main(String[] args)
	{
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduzca un nombre");
		String teclado=entrada.nextLine();
		
		System.out.println("introduzca un numero con decimales");
		double numeroDoble=entrada.nextDouble();
		System.out.println(teclado+" "+numeroDoble);
		//nextInt
		entrada.close();
	}
	/*
		Alumno al1=new Alumno(1200);
		Alumno al2=new Alumno("Rodrigo","Espa�ita","Del galgo");
		Alumno al3=new Alumno();
		al3.nombre="Pedro";
		al3.carrera="Fisicas";
		al3.pais="chile";
		
		System.out.println("primero: "+al1.nombre+", Segundo: "+al2.nombre+", tercero: "+al3.nombre);
		
	}

}

class Alumno
{
	String nombre;
	String pais;
	String carrera;
	
	public Alumno() {};
	
	public Alumno(String nombre, String pais, String carrera) 
	{
		this.nombre=nombre;
		this.pais=pais;
		this.carrera=carrera;
		
	}
	
	public Alumno(int valor) 
	{
		System.out.println(valor);
		
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public String getPais()
	{
		return pais;
	}
	public String getCarrera()
	{
		return carrera;
	}
	
	
	*/
	
}
