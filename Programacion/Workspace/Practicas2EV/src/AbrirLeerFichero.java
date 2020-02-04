import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.*;

public class AbrirLeerFichero {



	public static void main(String[] args) throws IOException 
	{
		FileSystem ficheros =FileSystems.getDefault();
		
		Path camino=ficheros.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\text.txt");
		
		try(Stream<String> flujo=Files.lines(camino, Charset.forName("UTF-8")))
				{
				flujo.forEach((String s) -> System.out.println(s));
				}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		String texto[]=new String[]{"1","2"};
		
		try(BufferedWriter br= Files.newBufferedWriter(camino, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
		{
			Arrays.stream(texto).forEach(s -> 
			{
				try 
				{
					br.newLine();
					br.write(s);
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
					
					);
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
