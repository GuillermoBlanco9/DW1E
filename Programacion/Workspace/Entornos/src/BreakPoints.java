
public class BreakPoints {
    
	public static void main(String[] args)
	{
		
		
		
		Persone a1=new Persone();
		
		a1.setNIA(1000);
		System.out.println(a1.getNIA());
		
		
		
	}
}

class Persone
{
	String nombre;
	String apellido;
	boolean casado;
	int nia;
	int edad;

	
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String _nombre)
	{
		nombre=_nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String _apellido)
	{
		apellido=_apellido;
	}
	public int getNIA()
	{
		return nia;
	}
	public void setNIA(int _nia)
	{
		nia= _nia;
	}
	public int getEdad()
	{ 
		return edad;
	}
	public void setEdad(int _edad)
	{
		edad= _edad;
	}
	public boolean getCasado()
	{
		return casado;
	}
	public void setCasado(boolean _casado)
	{
		casado=_casado;
	}
	

	
	
}