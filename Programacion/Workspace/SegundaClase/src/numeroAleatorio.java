import java.util.Scanner;
import java.util.Random;
public class numeroAleatorio {

	public static void main(String[] args) {
		int x;
		int intento=0;
		
		Scanner teclado=new Scanner(System.in);
		Random numOculto=new Random();
		int numAlea=numOculto.nextInt(100)+50;
		do {
			x=teclado.nextInt();
			if(x!=0) {
				
				if(x<numAlea) {
					System.out.println("el numero es mayor");
					
					
					intento++;
					}
					else if(x>numAlea) {
					System.out.println("el numero es menor");
					
					intento++;
					
					}
				
			}
			else {
				System.out.println("Salir del programa");
				}
			
		}
		while(x!=numAlea); while(x!=0); while(intento>9);
		
		teclado.close();
	
		
		
		if (intento<10) 
		{
			
			switch(intento) {
			
			case 0: case 1: case 2:
				System.out.println("Enhorabuena has ganado!");
				break;
			
			case 3: case 4: case 5:
				System.out.println("seguno puesto!!");
				break;

			case 6:case 7: case 8:
				System.out.println("tercer puesto!");
			
				break;
			case 9:
				System.out.println("premio de consolacion un mega aplauso para el crack!1!");
				break;	
			
			}
			
		}
		else {
			System.out.println("Se te acabaron los intentos");
		}
		
		}
	}
