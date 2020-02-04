package poligonosRegulares;

public class claseCalculo extends PoligonoCircunfCirculo implements ClaculosPoliCirInterfaz

{
	
	public claseCalculo(int nLados, double lLado) 
	{
		super(nLados, lLado);
		
	}
	
	
	
	
	public double lLado;
	public int nLados;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double AreaCir(double r) {
		
		return 0;
	}
	
	public double AreaPol(double peri, double ap) {
		
		return 0;
	}
	
	public double perimetro(int l, double a) {
		
		
		
		return l*a;
	}
	
	public double Apotema(double a, int l) {
		
		
		return a/(2*Math.tan(Math.PI/l));
	}
	
	public double radio(int l, double a) {
		 
		return 0;
	}
	
	public double altura(int l, double r, double ap) {
		
		return 0;
	}
	
	
	
	
}
