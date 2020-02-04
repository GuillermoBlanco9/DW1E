import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class CopiaSeguridad 
{
	
	
	
	

	public static void main(String[] args)
	{
		LocalTime hoy=LocalTime.now();
		String ahora=hoy.toString().replace(':','-');
		ahora=(String)ahora.subSequence(0,8);
		
		FileSystem ficherowindows =FileSystems.getDefault();
		
		Path ruta=ficherowindows.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\maestro.txt");
		Path rutadestino=ficherowindows.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\maestro"+ahora+".back");
		
		try
		{
			System.out.println("El propietario del fichero maestro es: "+Files.getOwner(ruta).getName());
			if(Files.notExists(rutadestino))
			{
			Path copiar= Files.copy(ruta, rutadestino);//copia el fichero en el otro.
			System.out.println(copiar);
			}
			System.out.println("Fecha modificacion: "+Files.getLastModifiedTime(ruta).toString());
			System.out.println(Files.getLastModifiedTime(ruta).toString().subSequence(11, 19));//no sirve para nada la subsequence sirve para recortar el string
			 
			FileTime fecha=Files.getLastModifiedTime(ruta);
			System.out.println(fecha);
			System.out.println(fecha.to(TimeUnit.DAYS));
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
