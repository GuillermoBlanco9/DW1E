package ErroresYExcepciones;

import java.util.*;

public class PrimerTryCatch 
{

	public static void main(String[] args) 
	{
		double cantidad=0;
		try(Scanner teclado=new Scanner(System.in))
		{
			System.out.println("introduce la cantidad: ");
			cantidad=teclado.nextDouble();
		}
		catch (InputMismatchException m) 
		{
			System.out.println(m.getClass());
			System.out.println(m.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Estoy en excepcion");
			//e.printStackTrace();
			System.out.println("*********************");
			
			System.out.println(e.getMessage());
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		System.out.println(cantidad);
	}
	

}
