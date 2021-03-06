



package Examen;
import java.time.*;
import java.time.format.*;



class Trabajador
{
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaAlta;
	private String ciudad;
	private String pais;
	double sueldoBruto;
	double porcientoIrpf;
	double porcientoSSocial;
	
	public Trabajador() {}
	
	public Trabajador(String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, String ciudad, String pais, double sueldoBruto, double porcientoIrpf, double porcientoSSocial) 
	{
		
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.fechaAlta=fechaAlta;
		this.fechaNacimiento=fechaNacimiento;
		this.pais=pais;
		this.sueldoBruto=sueldoBruto;
		this.porcientoIrpf=porcientoIrpf;
		this.porcientoSSocial=porcientoSSocial;
			
		
	}
	public double calculoSueldoNeto(double a,double b)
	{
		double c=(a/100*b);
		c=(double)Math.round(c*100)/100;
		return c;
	}
	public double calculoNeto(double a,double b,double c)
	{
		double d=(a+b)-c;
		d=(double)Math.round(c*100)/100;
		return d;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
	
	public String toString()
	{
		DateTimeFormatter fecha=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		double e=calculoSueldoNeto(porcientoIrpf,sueldoBruto);
		double y=calculoSueldoNeto(porcientoSSocial,sueldoBruto);
		String msj="El/La profesional "+nombre+". Su funci�n es: "+"\n Su especialidad es: "+"\n Fecha de alta: "+fechaAlta.format(fecha)+
				" Fecha de nacimiento: "+fechaNacimiento.format(fecha)+"\n Tiene un sueldo bruto de: "+sueldoBruto+
				"\n Descuentos: \n Por IRPF("+porcientoIrpf+"): "+calculoSueldoNeto(porcientoIrpf,sueldoBruto)+"\n Por Seguridad Scoial("+porcientoSSocial+"):"+calculoSueldoNeto(porcientoSSocial,sueldoBruto)+" \n Total sueldo neto: "+calculoNeto(e,y,sueldoBruto);
		return msj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
