package UTILIDAD;

public abstract class ClaseMadre
{
	private String nombre;
	private double cuota;

	public ClaseMadre(String n,double c) 
	{
		nombre=n;
		cuota=c;
	}
	
	public ClaseMadre() {}
	
	public  void mostrar(String n,double c)
	{
		nombre="pepe";
		cuota=1999.0;
	}
	public String mostrar()
	{
		return nombre;
	}
	
	public double cuota()
	{
		return cuota;
	}
	
	abstract public double calculo(double c);
	
	

}
