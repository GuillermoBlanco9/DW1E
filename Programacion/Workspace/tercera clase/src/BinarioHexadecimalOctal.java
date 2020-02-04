import java.util.Scanner;

public class BinarioHexadecimalOctal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        int decimal = teclado.nextInt();
        
        
        
        teclado.close();
        String hexadecimal = Integer.toHexString(decimal);
        String octal=Integer.toOctalString(decimal);
        String binario=Integer.toBinaryString(decimal);
        System.out.println(" hexadecimal:  "+ hexadecimal+" octal: "+octal+" binario: "+binario);
        
        
        
        
	}
        
	
		
     
}
        
        
        
        
        
        
    
	
		


	



	


