import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class ejercicioClaseLeerFichero 
{

	public static void main(String[] args) 
	{
		FileSystem ficheros =FileSystems.getDefault();
		
		Path rutaTemporal.getPath
		Path rutaMaestrosinFichero.getPath
		Path rutaMaestroconFichero.getPath
		
		
		
		if(Files.notExists(rutaMaestroConFichero))
		{
			try
			{
				Files.createDirectory(rutaMaestrosinfichero);
				Files.createFile(rutaMaestroConFichero);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		if(Files.exists(rutaTemporal))
		{
			try(Stream<String> flujotemporal =Files.lines(rutaTemporal, Charset.defaultCharset()))
			{
				try(BufferedWriter bw =FIles(RutaMaestroConFichero, Charset.defaultCharset(),StandardOpenOption.APPEND))
				{
					flujotemporal.forEach(s ->
					{
						try
						{
							bw.write(s);
							bw.newLine();
							
							
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
						
					});
					
					
					
				}//fin try buffered
				catch(IOException e)
				{
					e.printStackTrace();
				}
				try
				{
					Files.delete(rutaTemporal);
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
				
			}
			
			
			
		}//fin if

		try(Stream<String> flujo=Files.lines(rutaMaestroConFichero, Charset.forName("UTF-8")))
		{
			flujo.forEach((String s) -> System.out.println(s));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
