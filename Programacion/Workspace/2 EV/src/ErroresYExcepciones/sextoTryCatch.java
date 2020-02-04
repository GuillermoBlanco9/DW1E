package ErroresYExcepciones;

public class sextoTryCatch
{

	public static void main(String[] args) {
		
		boolean edad=true;
		
		try 
		{
			if(!edad)
			{
				throw new FalsoException("Detectado menor de edad.");
			}
			else
				System.out.println("Puedes pasar.");
		}
		catch(FalsoException e)
		{
			System.out.println(e.getMessage()+"   "+e.getClass());
		}
		
		
		
	}

}

class FalsoException extends Exception
{
	public FalsoException(String s)
	{
		super(s);
	}
}