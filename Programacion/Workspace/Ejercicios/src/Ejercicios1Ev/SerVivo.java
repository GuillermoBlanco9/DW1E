package Ejercicios1Ev;

public abstract class SerVivo
{
	String comer="Comida";
	String nombre;
	double altura;
	int edad;
	int patas;
	String claseA,claseP;
	boolean extinc;
	
	
	
	
	abstract String comer(String a);
	
	abstract String beber(String b);
	
	public void deseoVivir()
	{
		System.out.println("Deseo Morir.");
	}

	public String getComer() {
		return comer;
	}

	public void setComer(String comer) {
		this.comer = comer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isExtinc() {
		return extinc;
	}

	public void setExtinc(boolean extinc) {
		this.extinc = extinc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
