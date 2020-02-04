package ErroresYExcepciones;

public class tercerTryCatch
{

	public static void main(String[] args) 
	{
		int v1=4, v2=0,resultado=0;
		
		try 
		{
			resultado=operacion(v1,v2);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		catch(Exception e)
		{
			e.getClass();
		}
		finally
		{
			System.out.println("Reinicie el programa");
		}
			System.out.println(resultado);
		
	}
	public static int operacion(int a, int b) throws ArithmeticException
	{
		int resultado=0;
		
			resultado= (a/b);
		
		
		return resultado;
	}
}
