package Herencia;

public class Doctor extends Personajes 
{

	public static void main(String[] args) 
	{
		Doctor obj=new Doctor();
		
		obj.setNombre("Paula");
		obj.setApellido("Lopez");
		obj.setCalle("Calle del amor");
		obj.setEdad(25);
		obj.setTelefono("674232393");
		
		System.out.println(obj.edadAmpliada());
		System.out.println("Nombre: "+obj.getNombre()+" y su apellido es: "+obj.getApellido()+" un apluado!!!");
	
	}	

}
