import clasesUtiles.IdentificacionPersona;


public class Identificacion extends IdentificacionPersona
{
	public Identificacion(String nombre, int id, String acceso)
	{
		super(nombre,id,acceso);
	}
	
	public Identificacion(String nombre)
	{
		super(nombre);
	}
	
	public static void main(String[] args) 
	{
		Identificacion nombre=new Identificacion("Benito");
		Identificacion obj=new Identificacion("Pascual",100,"Top");
		System.out.println("Nombre: "+obj.getNombre()+" ID: "+obj.getId()+" Acceso: "+obj.getAcceso());
		
		System.out.println(nombre.getNombre());
	}

}
