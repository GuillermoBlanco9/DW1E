package UTILIDAD;

public class PruebaInterfaces extends CLaseHija implements MiInterfaz,OtraInterface
{
	private double a=12.43, b=20.15;
	private int c=20, d=40;	
			
	
	public static void main(String[] args)
	{
		PruebaInterfaces obj=new PruebaInterfaces();
		double resulDoble=obj.sumar(obj.a, obj.b);
		int resulEntero=obj.sumar(obj.c, obj.d);
		
		obj.porDefecto();
		obj.metodoOtraI();
		obj.mostrar(resulDoble);
		obj.mostrar(resulEntero);
		
		
		
		
		System.out.println(obj.NOMBRE);
		
		System.out.println(obj.ALTURA);
		

		System.out.println(MiInterfaz.ANOS); //para los static se pone le nombre de la clas no del objeto
	}



	public double sumar(double a,double b)
	{
	
		return a+b;
	}


	
	public int sumar(int c, int d) {
		
		return c+d;
	}



	public void mostrar(double a) 
	{
		System.out.println(a);
		
	}
	
	public void mostrar(int a)
	{
		System.out.println(a);
	}
	public void imprimir()
	{
		
	}
	public void porDefecto()
	{
		System.out.println("Estoy en la clase");
	}



	
	public void metodoOtraI() 
	{
		System.out.println("Otra Interfaz");
		
	}

}
