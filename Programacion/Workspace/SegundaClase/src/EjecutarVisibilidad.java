
public class EjecutarVisibilidad {

	public static void main(String[] args) 
	{
		visibilidad obj=new visibilidad();
		
		obj.setSueldo(1200.45);
		obj.setFrase("Hoy es ");
		System.out.println(toString(obj));
	}
	public static String toString(visibilidad obj)
	{
		String mensaje="El sueldo es: "+obj.getSueldo()+" "+obj.getFrase();
		return mensaje;
	}
}
