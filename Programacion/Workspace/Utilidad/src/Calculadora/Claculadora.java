package Calculadora;
import java.util.*;

public class Claculadora implements CalculoBase,CalculoAvanzado
{

	

	public static void main(String[] args) 
	{
		
		int opcion;
		Scanner teclado=new Scanner(System.in);
		Claculadora obj=new Claculadora();
		System.out.println("Opcion 1: calculadora base \nOpcion 2: calculadora pro");
		opcion=teclado.nextInt();
		
		
		
		
		switch(opcion)
		{
			case 1:
				System.out.println("Introduzca dos numeros: ");
				
				double a=teclado.nextDouble();
				System.out.println("-_-_-_-_-_-");
				double b=teclado.nextDouble();
				
				double resulSuma=obj.suma(a, b);
				double resulResta=obj.resta(a, b);
				double resulMult=obj.mult(a, b);
				double resulDiv=obj.div(a, b);
				System.out.println("Suma:  "+resulSuma+" resta:  "+resulResta+" Multiplicaci�n:  "+resulMult+" Divisi�n:  "+resulDiv);
				
				break;
			case 2:
				System.out.println("Introduzca un numero: ");
				
				double c=teclado.nextDouble();
				System.out.println("Introduzca el numero del logaritmo: ");
				int d=teclado.nextInt();
				System.out.println("Introduzca la base del logaritmo: ");
				int e=teclado.nextInt();
				
				double resulSumaA=obj.sumaA(c);
				double resulRestaA=obj.restaA(c);
				
				
				
				
				System.out.println(" Suma de pi:  "+resulSumaA+" Resta de pi:  "+resulRestaA+" Logaritmo: "+(double)Math.round(obj.log(d,e)*100)/100);
				
				break;
		
		}
		teclado.close();
	}

	
	public double sumaA(double a) {
		a=a+Math.PI;
		return formatear(a);
	}

	
	public double restaA(double a) {
		a=a-Math.PI;
		return formatear(a);
	}

	public double log(int a, int b) {
		double x;
		x=Math.log(a)/Math.log(b);
		return x;
	}

	public double suma(double a, double b) {
		return a+b;
	}

	
	public double resta(double a, double b) {
		return a-b;
	}

	public double mult(double a, double b) {
		return a*b;
	}

	public double div(double a, double b) {
		double x;
		x=a/=b;
		return formatear(x);
		
	}

	private double formatear(double x)
	{
		double z=(double)Math.round(x*100)/100;
		return z;
	}
}