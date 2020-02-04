package ErroresYExcepciones;

public class CuartoTryCatch {

	public static void main(String[] args) {
		CuartoTryCatch obj = new CuartoTryCatch();
		try {
		System.out.println(obj.calculo());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+" "+e.getClass());
		}
	}
	public String calculo()
	{
		try 
		{
		int numeros[]= {1,2,3,4,5};
		
		int primerPar = primerPar(numeros);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+" "+e.getClass());
		}
		return "OK";
	}
	public int primerPar(int v[]) throws IndexOutOfBoundsException
	{
		return v[8];
	}
	
}
