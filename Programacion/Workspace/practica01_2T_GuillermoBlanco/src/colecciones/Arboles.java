package colecciones;

public class Arboles
{
	private String nombre;
	private double altura;
	private int añosEdad;
	private String lugarOrigen;
	private boolean hojaCaduca;
	
	public Arboles() {}
	
	public Arboles(String nombre, double altura, int añosEdad, String lugarOrigen, boolean hojaCaduca)
	{
		this.nombre=nombre;
		this.altura=altura;
		this.añosEdad=añosEdad;
		this.lugarOrigen=lugarOrigen;
		this.hojaCaduca=hojaCaduca;
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

	public int getAñosEdad() {
		return añosEdad;
	}

	public void setAñosEdad(int añosEdad) {
		this.añosEdad = añosEdad;
	}

	public String getLugarOrigen() {
		return lugarOrigen;
	}

	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}

	public boolean isHojaCaduca() {
		return hojaCaduca;
	}

	public void setHojaCaduca(boolean hojaCaduca) {
		this.hojaCaduca = hojaCaduca;
	}
	
	
	public String toString() {
			String sss;
			if(isHojaCaduca()) 
			{
				sss=String.valueOf(isHojaCaduca());
				sss="si";
			}
			else
			{
				sss="no";
			}
			
		return "El nombre= " + getNombre() + ", Altura= " + getAltura()
				+ ", Años Edad= " + getAñosEdad() + ", Lugar de Origen= " + getLugarOrigen() + ", Hoja Caduca= "
				+ sss;
	}
}

