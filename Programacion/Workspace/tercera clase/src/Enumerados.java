

public class Enumerados 
{
	
	private enum Meses
	{
		
		Enero("January",31),Febrero("February",28),Marzo("March",31),Abril("April",30),Mayo("May",31),Junio("June",31),Julio("july",31),Agosto("Agust",31),
		Septiembre("September",30),Octubre("october",31),Noviembre("November",30),Diciembre("December",31);
		public String mes;
		public int dias;
		
		private Meses(String m,int d)
		{
			mes=m;
			dias=d;
		}
		
		public String getMes()
		{
			return mes;
		}
		public String toString(Meses obj)
		{
			String mensaje="El nombre del elemento es: "+obj.name()+". El orden que ocupa es: "+obj.ordinal()+"\nTiene "+obj.dias+" dias";
			return mensaje;
		}
		
	}

	public static void main(String[] args)
{
		Meses miMes=Meses.Julio;
		Meses miMes2=Meses.Diciembre;
		
		System.out.println(miMes.toString(miMes));
		System.out.println(" ");
		System.out.println(miMes2.toString(miMes2));
		System.out.println(" ");
		for(Meses x:Meses.values())
			System.out.println(x);
		
		System.out.println(" ");
		System.out.println(miMes2.getMes());
		
	
		
		
	}

	
	
}
