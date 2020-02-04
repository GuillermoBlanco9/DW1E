import java.util.Scanner;

public class MayoryMenor {

	
	public static void ejTablaMultiplicar()
	{
		int n=13;
		int contador=0;
		Scanner ej1 = new Scanner(System.in);
		System.out.println("Dame un número que me parece insustancial");
		n = ej1.nextInt();
		
		while(contador<=10)
		{
			System.out.println(n*contador);
			contador++;
		}
		ej1.close();
	}
	
	public static void mayorMenor()
	{
		
		Scanner ej2=new Scanner(System.in);
		Scanner ej3=new Scanner(System.in);
		//definimos las variables
		int num1 ;
		
		int num2 ;
		num1 = ej2.nextInt();
		num2 = ej3.nextInt();
		
		boolean ejemplo = num1 > num2;
		
		
		
		if(ejemplo)
		{
			System.out.println("El primero es mayor "+num1);
		}
		else
		{
			System.out.println("El segundo es mayor "+num2);
		}
		ej2.close();
		ej3.close();
	}

	public static void main(String[] args) 
	{
		mayorMenor();
		ejTablaMultiplicar();
		

	}

}
