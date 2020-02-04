import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Stream;

/**
 * tenemos tres ficheros maestros , tenemos un fichero tmp clientes tmp proveedor y tmp cobros
	en los ficheros tenemos cliente uno nombre y direccion creados a mano con una coma por cada dato en cada fichero tmp.txt
	y con los cobros ponemos un cliente con cada cobro.
	el programa tiene que: preguntar ++++++si+++++ existe el fichero tmp, si existe tenemos que hacer un write en el fichero maestro que añade info
	una vez escrito en los ficheros maestros los ficheros tmp se borran
	si ++++no++++ existe se manda un mesaje a la consola faltan datos.
	una vez borrados los tmps hacemos una copia de seguridad de los ficheros maestros con año-mes-diahora-minutos-segs.back
	los ficheros maestros tienen que estar en una carpeta distinta de los tmps y dentro de esa carpeta otra carpeta que contenga los backups
	y ver la fecha de modificacion de cada fichero maestro al final
 * @author Alonso Rebolo
 * 
 *
 */
public class ejerciciodetresficheros {
	
	

	/**
	 * metodo donde se resuleve el problema
	 * 
	 * @param args - array de strings
	 */
	
	public static void main(String[] args) {
		
		
		
		
		LocalDate fecha=LocalDate.now();
		LocalTime hora=LocalTime.now();
		
		String ahora=hora.toString().replace(':',' ');
		ahora=(String)ahora.subSequence(0,8);
		
		String tiem=hora.toString();
		String dia=fecha.toString();
		
		
		
		FileSystem fichero=FileSystems.getDefault();
		Path directorio=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\tmps"); 
		Path directorioM=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros"); 
		Path tmp1=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\tmps\\tmp1.txt");
		Path tmp2=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\tmps\\tmp2.txt");
		Path tmp3=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\tmps\\tmp3.txt");
		Path m1=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\proveedores.txt");
		Path m2=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\cliente.txt");
		Path m3=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\cobro.txt");
		
		
		
		
		
		
		
		
		if(!Files.exists(m1))
		{
			System.out.println("Faltan datos");
		}
		if(!Files.exists(m2))
		{
			System.out.println("Faltan datos");
		}
		if(!Files.exists(m3))
		{
			System.out.println("Faltan datos");
		}
		if(Files.exists(directorioM))//me creo el directorio maestro
			System.out.println("copiando al directorio.");
		else
			try {
				Files.createDirectory(directorioM);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		if(Files.exists(directorio))//me creo el directorio de tmps
			System.out.println("directorio tmps ya creado.");
		else
			try {
				Files.createDirectory(directorio);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		if(Files.exists(m1))//me creo el fichero
			System.out.println("copiando al fichero.");
		else
			try {
				Files.createFile(m1);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		if(Files.exists(m2))//me creo el fichero
			System.out.println("copiando al fichero.");
		else
			try {
				Files.createFile(m2);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		if(Files.exists(m3))//me creo el fichero
			System.out.println("copiando al fichero.");
		else
			try {
				Files.createFile(m3);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		if(Files.exists(tmp1))//copiar el tmps al maestro
		{
			try(Stream<String> flujotemporal =Files.lines(tmp1, Charset.defaultCharset()))
			{
				try(BufferedWriter bw =Files.newBufferedWriter(m1, Charset.defaultCharset(),StandardOpenOption.APPEND))
				{
					flujotemporal.forEach(s ->
					{
						try
						{
							bw.write(s);
							bw.write(" ");
							bw.write(dia);
							bw.write(" ");
							bw.write(tiem);
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
					Files.delete(tmp1);
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}//fin del if
		
		
		if(Files.exists(tmp2))//copiar el tmps al maestro
		{
			try(Stream<String> flujotemporal =Files.lines(tmp2, Charset.defaultCharset()))
			{
				try(BufferedWriter bw =Files.newBufferedWriter(m2, Charset.defaultCharset(),StandardOpenOption.APPEND))
				{
					flujotemporal.forEach(s ->
					{
						try
						{
							bw.write(s);
							bw.write(" ");
							bw.write(dia);
							bw.write(" ");
							bw.write(tiem);
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
					Files.delete(tmp2);
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}//fin del if
		
		
		if(Files.exists(tmp3))//copiar el tmps al maestro
		{
			try(Stream<String> flujotemporal =Files.lines(tmp3, Charset.defaultCharset()))
			{
				try(BufferedWriter bw =Files.newBufferedWriter(m3, Charset.defaultCharset(),StandardOpenOption.APPEND))
				{
					flujotemporal.forEach(s ->
					{
						try
						{
							bw.write(s);
							bw.write(" ");
							bw.write(dia);
							bw.write(" ");
							bw.write(tiem);
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
					Files.delete(tmp3);
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}//fin del if
		
		//crear los backups y la carpeta de estos
		
		Path directorioMB=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\Backups"); 
		
		Path mb1=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\Backups\\proveedores"+fecha+ahora+".back");
		Path mb2=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\Backups\\cliente"+fecha+ahora+".back");
		Path mb3=fichero.getPath("C:\\Users\\Guille\\Desktop\\PRueba de ficheros java\\Maestros\\Backups\\cobro"+fecha+ahora+".back");
		
		
		if(Files.exists(directorioMB))//me creo el directorio maestro backups
			System.out.println("copiando al directorio.");
		else
			try {
				Files.createDirectory(directorioMB);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

		
		
		if(Files.notExists(mb1))
		{
			try 
			{
			
				Files.copy(m1, mb1);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
				
				
		}
		
		if(Files.notExists(mb2))
		{
			try 
			{
			
				Files.copy(m2, mb2);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
				
				
		}
		
		if(Files.notExists(mb3))
		{
			try 
			{
			
				Files.copy(m3, mb3);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
				
				
		}
			
		
		
		
		
	}

}
