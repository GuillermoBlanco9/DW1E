

import java.util.*;
import java.util.stream.*;
import java.time.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;

public class ProgresionAritmeticaEnFichero
{

	public static void main(String[] args)
	{
		int primerNum,numeroTer,diferencia;
		
		FileSystem ficheros = FileSystems.getDefault();
		
		//Path ruta = ficheros.getPath("H:/IES_CA_MADRID/IES Actual/ies ClaraDelRey2019_2020/Programacion_DW1E/PruebasJava/EjemplosClase/src/misCosas/FicheroProgresion");
		//Path rutaConFichero = ficheros.getPath("H:/IES_CA_MADRID/IES Actual/ies ClaraDelRey2019_2020/Programacion_DW1E/PruebasJava/EjemplosClase/src/misCosas/FicheroProgresion/datos.txt");
		Path ruta = ficheros.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Progresion"); //El directorio raiz es el proyecto
		Path rutaConFichero = ficheros.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Progresion\\TerminosProgresion.txt");
		
		try(Scanner teclado = new Scanner(System.in))
		{
			System.out.print("Introduzca el primer n�mero entero de la progresi�n:");
			primerNum = teclado.nextInt();
			
			System.out.print("Introduzca el n�mero de t�rminos de la progresi�n:");
			numeroTer = teclado.nextInt();
			
			System.out.print("Introduzca la diferencia de la progresi�n:");
			diferencia = teclado.nextInt();
			
			String cadena = calculo(primerNum, numeroTer, diferencia);
			
			// Creo el directorio y el fichero si no existen
			
			if(!Files.exists(ruta))
				Files.createDirectory(ruta);
			
			if(!Files.exists(rutaConFichero))
				Files.createFile(rutaConFichero);
			
			// Creo el buffer de escritura para poder escribir en el fichero
			
			try(BufferedWriter bw = Files.newBufferedWriter(rutaConFichero, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
			{
				bw.write(cadena);
				bw.newLine();
			}//Fin try BufferedWriter
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			// Creo el Stream para leer el fichero e imprimir por consola el contenido
			
			try(Stream<String> flujo = Files.lines(rutaConFichero, Charset.forName("UTF-8")))
			{
				flujo.forEach(s -> System.out.println(s));
			}//Fin try Stream de flujo
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}//Fin try Scanner
		catch(InputMismatchException i)
		{
			System.out.println("Dato introducido "+i.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		
		
	}//Fin de Main
	
	public static String calculo(int n1, int nt, int dif)
	{
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		
		int j=0,ter=n1; //j es el n�mero de t�rminos y resul es el valor de la cadena donde se acumula la progresi�n
		String resul="";
		
		while (j<nt)
		{
			resul=resul+Integer.toString(ter)+",";
			ter+=dif;
			j++;
		}
		
		return resul+" ** "+fecha+" - "+hora; //La progresi�n m�s la fecha y la hora actual
		
	}

}//Fin de clase