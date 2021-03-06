package Cliente;



public class Cliente 
{
	private String id;
	private String nombre;
	private String fechaNacimiento;
	private double sueldo;
	private boolean vip;
	
	public Cliente() {}
	
	public Cliente(String id, String nombre, String fechaNacimiento, boolean vip)
	{
		this.id=id;
		this.nombre=nombre; 
		this.fechaNacimiento=fechaNacimiento;
		this.vip=vip;
	}
	public Cliente(String id, String nombre, String fechaNacimiento, double sueldo, boolean vip)
	{
		this.id=id;
		this.nombre=nombre; 
		this.fechaNacimiento=fechaNacimiento;
		this.sueldo=sueldo;
		this.vip=vip;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String toString()
	{
		String msj;
		
		msj="El cliente de ID "+id+", de nombre "+nombre+" y fecha de nacimiento el "+fechaNacimiento+", tiene un sueldo de "+sueldo+"� y es vip";
		
		return msj;
	}
	public String datos()
	{
		String msj;
		msj="El cliente de ID "+id+", de nombre "+nombre+" y fecha de nacimiento el "+fechaNacimiento+", tiene un sueldo de "+sueldo+"� y no es vip";
		return msj;
	}
}
