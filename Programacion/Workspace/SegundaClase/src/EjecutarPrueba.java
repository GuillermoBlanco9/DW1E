
public class EjecutarPrueba {

	public static void main(String[] args)
	{
	
	Prueba.setNombre("Manu");	
	Prueba.setSueldo(1200);
		System.out.println(Prueba.getNombre()+" "+Prueba.getSueldo());
		System.out.println(nombre());
		System.out.println(Math.PI);
	}
	public static String nombre()
	{
		
		return Prueba.getNombre();
	}
}
