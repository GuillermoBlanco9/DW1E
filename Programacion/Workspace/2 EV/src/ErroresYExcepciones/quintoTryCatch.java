package ErroresYExcepciones;

public class quintoTryCatch 
{

	public static void main(String[] args) 
	{
		int lista[] = {1,5,7,9,10,0,3,2};
		
		try 
		{
			comprobacion(lista);	
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void comprobacion(int ent[]) throws Throwable
	{
		for (int i = 0; i < ent.length; i++)
		{
			if(ent[i]==0)
			{
				i=i+1;
				throw new Throwable("En la posicion "+i+" polla, polla polla. ");
			}
		}
		
		System.out.println("No hay ceros.");
	}

}
