package ErroresYExcepciones;
import java.util.*;
public class ExcepcionesEj1 
{

	public static void main(String[] args) 
	{
		int n1, n2;
		
		


			try(Scanner teclado=new Scanner(System.in))
			{
				System.out.println("Introduzca dos numeros: ");
				n1=teclado.nextInt();
				n2=teclado.nextInt();
				if(n1>n2)
				{
					throw new Throwable("n1 es mayor que n2");
				}
				else throw new Throwable("n2 es mayor o igual que n1");
			}
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
			}
			
			
			
		
		
		
		
		
		
	}

}
