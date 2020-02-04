package practica1;

public class Arboles implements Comparable<Arboles>
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
	@Override
	public int compareTo(Arboles x) 
	{
	    String comp=new String(String.valueOf(getAñosEdad())+getLugarOrigen());
	    String comp2=new String(String.valueOf(x.getAñosEdad())+x.getLugarOrigen());
	    return comp.compareTo(comp2);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lugarOrigen == null) ? 0 : lugarOrigen.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arboles other = (Arboles) obj;
		if (lugarOrigen == null) {
			if (other.lugarOrigen != null)
				return false;
		} else if (!lugarOrigen.equals(other.lugarOrigen))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
		return "Nombre del árbol: " + getNombre() + "\n Altura: " + getAltura()
				+ "\n Edad en años= " + getAñosEdad() + "\n Lugar de Origen: " + getLugarOrigen() + "\n Hoja Caduca= "
				+sss+"\n*******************\n";
	}
}

