package poligonosRegulares;

public class PoligonoCircunfCirculo 
{
	private double longLado;
	private int nLado;
	private double preimetro;
	private double radio;
	private double apotema;
	private double area;
	
	public PoligonoCircunfCirculo(int nLados,double lLado)
	{
		nLado=nLados;
		longLado=lLado;
	}
	

	
	public double getLongLado() {
		return longLado;
	}
	public void setLongLado(double longLado) {
		this.longLado = longLado;
	}
	public int getnLado() {
		return nLado;
	}
	public void setnLado(int nLado) {
		this.nLado = nLado;
	}
	public double getPreimetro() {
		return preimetro;
	}
	public void setPreimetro(double preimetro) {
		this.preimetro = preimetro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	

}
