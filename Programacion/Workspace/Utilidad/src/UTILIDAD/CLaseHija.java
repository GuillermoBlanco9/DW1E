package UTILIDAD;

public class CLaseHija extends ClaseMadre
{
	public CLaseHija()
	{
		super("Juan",1900.00);
	}
	

	public static void main(String[] args) 
	{
		CLaseHija obj=new CLaseHija();
		
		System.out.println("Nombre: "+obj.mostrar());
		
		System.out.println("Sueldo: "+(double)Math.round(obj.calculo(1900.00)*100)/100);
		
	}

	
	public double calculo(double cuota) {
		
		return cuota*1.05;
	}

}
