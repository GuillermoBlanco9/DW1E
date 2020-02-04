import java.util.Random;
import java.io.IOException;
import java.util.Scanner;
public class numeroAleatorio1 {

	int numAlea;
	int x;
	int intento=0;
	
	
	
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner entrada=new Scanner(System.in);
		
		int x, numAlea;
		int intento=0;
		
		
		Random numOculto=new Random();
			numAlea=50+numOculto.nextInt(151);	
	do {	
		x=entrada.nextInt();
		
		
		
		
		boolean falla= x > numAlea;
		if  (falla){ 
			System.out.println("el numero es menor");
			intento++;
		}
		else {
			System.out.println("el numero es mayor");
			intento++;
		}
			
			
		
	
		
		
		
		
		
		
		
		
	}while (x!=numAlea);
		
		
		
	}
}