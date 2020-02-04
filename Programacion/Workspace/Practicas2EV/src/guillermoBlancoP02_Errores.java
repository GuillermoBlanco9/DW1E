import java.util.*;


public class guillermoBlancoP02_Errores 
{

	public static void main(String[] args)
	{
		
		
		String nom="Sra.";
		double num=0.0;
		
		
		try(Scanner dato=new Scanner(System.in);)
		{
			System.out.println("Introduzca el tratamiento 'Sra.' o 'Sr.'.");
			nom=dato.nextLine();
			
		
			
			if(nom.equals("Sra.") || nom.equals("Sr."))
			{
				System.out.println("Introduzca una cantidad "+nom);
				
				num=dato.nextDouble();
				
				calculo(num);
				
				System.out.println(nom+" *** "+num);
			}
			else
			{
				throw new TratamientoException("El tratamiento de "+nom+" no es correcto.");
			}
			
		}
		catch(TratamientoException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NegativoException e)
		{
			System.out.println(e.getMessage());
		}
		catch(FueraDeRangoException e)
		{
			System.out.println(e.getMessage());
		}
		catch(CeroException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			
		}
		
		

	}
	
	public static double calculo(double n) throws NegativoException,CeroException,FueraDeRangoException
	{
		
		if(n<0)
		{
			throw new NegativoException("No se admiten cantidades negativas");
		}
		if(n==0)
		{
			throw new CeroException("No se puede poner cero");
		}
		if(n>1000000 || n<1000)
		{
			throw new FueraDeRangoException("Fuera de rango");
		}
		else
		{
			return n;
		}
		
		
	}

	
}

class TratamientoException extends Exception
{
	public TratamientoException(String s)
	{
		super(s);
	}
	
}

class NegativoException extends Exception
{
	public NegativoException(String s)
	{
		super(s);
	}
	
}
class FueraDeRangoException extends Exception
{
	public FueraDeRangoException(String s)
	{
		super(s);
	}
	
}
class CeroException extends Exception
{
	public CeroException(String s)
	{
		super(s);
	}
	
}


