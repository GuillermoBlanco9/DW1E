package UTILIDAD;

public interface MiInterfaz 
{
	//como son final no se puede cambiar el valor de los atributos en la clase que implementa la interfaz
	static final String NOMBRE="Pepe";
	
	static final double ALTURA=177.7;
	
	static final int ANOS=20;

	public String p="Inicializo";
	
	public double sumar(double a,double b);
	
	
	public int sumar(int a,int b);
	
	
	public void mostrar(double a);
	
	static int prueba(int a)
	{
		return a;
	}
	
	default void porDefecto() 
	{
		System.out.println("Eres bobo rebolo");
	}
	
	
}
