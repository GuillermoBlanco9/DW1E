package clasesUtiles;

public class Multiplicar 
{
	public int n1,n2,n3;
	
	public Multiplicar(int a,int b,int c) 
	{
		n1=a;
		n2=b;
		n3=c;
	}
	public Multiplicar(int a,int b) 
	{
		n1=a;
		n2=b;
		
	}
	public int multiplicaciones(int a1,int a2,int a3) 
	{
		return a1*a2*a3;
	}
	public int multiplicaciones(int a1,int a2) 
	{
		return a1*a2;
	}
	
	
}
