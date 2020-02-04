package ErroresYExcepciones;
import java.util.Scanner;



public class ej22
{

	public static void main(String[] args) 
	{
		int n1,n2;
		double resul=0;
		try(Scanner teclado=new Scanner(System.in))
				{
			System.out.println("Introduzca el numero: ");
					n1=teclado.nextInt();
			System.out.println("Introduzca el porcentaje: ");
					n2=teclado.nextInt();
					resul=(n1*n2)/100d;
					
					if(resul>=0 && resul<=100)
					{
						System.out.println(resul);
					}
					else
					{
						if(resul>100&&resul<=1000)
						{
							throw new SobreCoste("EL resultado esta entre 101 y 1000");
						}
						
						else
						{
							throw new Excesivo("El resultado es superior a 1000");
						}
					}
					
					
					
				}
		catch(SobreCoste e)
		{
			System.out.println(e.getMessage());
		}
		catch(Excesivo e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(resul);
		
		
		
		/*
		double n1,n2,resul;
		try(Scanner teclado=new Scanner(System.in);)
		{
			System.out.println("Introduzca un divisor y un dividendo:\n ");
			n1=teclado.nextDouble();
			n2=teclado.nextDouble();
			resul=n1/n2;
			if(n2<0)
			{
				throw new ArithmeticException("Divisor negativo");
			}
			else
				if(n2==0)
			{
				throw new ArithmeticException("EL divisor es 0");
			}
				else
				{
					System.out.println(resul);
				}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}*/
		

	}

}
class SobreCoste extends Throwable{
	public SobreCoste(String s) {
		super(s);
	}
}

class Excesivo extends Throwable{
	public Excesivo(String s) {
		super(s);
	}
	
}
//recojer 2 numeros operacion de dividir y controlar error de dividir por 0 y si el divisor es negativo tambien error