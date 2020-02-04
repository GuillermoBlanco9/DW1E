import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		//creamos un objeto del tipo file system
		FileSystem pepe=FileSystems.getDefault();
		//asignamos el camino del fichero
		Path pepe1=pepe.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\ejemplo.txt");
		System.out.println(pepe1.getParent());
		
		
		String meterDatos[]= {"dato1","dato2","dato3","dato4"};
		
		
		System.out.println("Ruta: "+pepe1.isAbsolute());
		System.out.println("Systema de ficheros: "+pepe1.getFileSystem());
		System.out.println("Fichero: "+pepe1.getFileName());
		System.out.println("Root: "+pepe1.getRoot());
		
		//preguntar si existe un fichero
		if(Files.exists(pepe1))
		{
			System.out.println("Existe el fichero "+pepe1.getFileName());
		}
		else 
			System.out.println("No existe ese ficherico");
		
		if(Files.isDirectory(pepe1))
			System.out.println("Es un dir");
		else
			System.out.println("No es un dir");
		
		System.out.println("Ejecutable?: "+Files.isExecutable(pepe1));
		
		//crear un directorio
		Path dirNuevo=pepe.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\hola");
		if(Files.exists(dirNuevo))
			System.out.println("Ya existe el directorio");
		else
			Files.createDirectory(dirNuevo);
		
		Path ficheroNuevo=pepe.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\hola\\elpepote.txt");
		
		if(!Files.exists(ficheroNuevo))
			Files.createFile(ficheroNuevo);
		try(BufferedWriter fi= Files.newBufferedWriter(ficheroNuevo, Charset.forName("UTF-8"), StandardOpenOption.WRITE))
		{
			Arrays.stream(meterDatos).forEach(s ->
			{
			try
			{
				fi.write(s);
				fi.newLine();
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
			});
		}
		
	/*	
		//nos creamos le array que contendra los elementos a meter en el archivo lol
		String pepon[]= new String[] {"luismi","","luismi"};
		//nos cramos el stream por que no se pueden meter directamente strings en el archivo
		
		//me creo el buffer para meter los datos del array incluyendo poner el metodo arrays.stream que convierte el contenido en stream
		try(BufferedWriter pepote= Files.newBufferedWriter(pepe1, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
		{
			Arrays.stream(pepon).forEach(s ->
			{
				try
				{
					pepote.newLine();
					pepote.write(s);
				}
				catch(IOException e)
				{ 
					e.printStackTrace();
				}
				
			}
					
					);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(Stream<String> pepito=Files.lines(pepe1,Charset.forName("UTF-8")))
		{
			//lee el archivo
			pepito.forEach((String s) -> System.out.println(s));
			System.out.println("Oculto?: "+Files.isHidden(pepe1));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
																										*/
	}

}
