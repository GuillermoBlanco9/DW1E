package ErroresYExcepciones;

public class segundoTryCatch 
{

	public static void main(String[] args) 
	{
		int num=10, den=0, res=0;
		
		try 
		{
			res=num/den;
			
		} 
		catch(ArithmeticException m)
		{
			System.out.println(m.getMessage());
			m.getStackTrace();
		}
		catch (Exception e)
		{
			//ver el tipo de excepción
			System.out.println(e.getClass());
		}
		finally
		{
			System.out.println("fin de programa");
		}
		System.out.println(res);
		
	}

}
