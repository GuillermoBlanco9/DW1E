
import java.time.LocalDate;
import java.util.*;
public class PruebaExamen
{

	public static void main(String[] args)
	{
		
		String idE="",nomE="";
		String fC=null,fA=null;
		boolean repe=false;
		double costeM=0;
		System.out.println("Cuantos alumnos quiere dar de alta");
		Scanner teclado=new Scanner(System.in);
		
		int numElementos=teclado.nextInt();
		
		Estudiante obj=null;
		
		LocalDate fContrato=null, fAniversario=null;
		
		Estudiante lista[]=new Estudiante[numElementos];
		
		for(int i=0;i<numElementos;i++)
		{
			idE="Estu"+i;
			System.out.println("Nombre: ");
			nomE=teclado.next();
			System.out.println("Fecha contrato <aaaa-mm-dd>: ");
			fC=teclado.next();
			System.out.println("Fecha aniversario <aaaa-mm-dd>:  ");
			fA=teclado.next();
			
			
			
			try
			{
				fContrato=LocalDate.parse(fC);
				fAniversario=LocalDate.parse(fA);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Coste matriula si lo desconoce poner 0: ");
			costeM=teclado.nextDouble();
			System.out.println("Es repetidor? (true,false): ");
			repe=teclado.nextBoolean();
			
			if(costeM==0)
			{
				obj=new Estudiante(idE,nomE,fContrato);
			}
			else
			{
				obj=new Estudiante(idE,nomE,fContrato,fAniversario,repe,costeM);
			}
			
			lista[i]=obj;
			
			
		}
		
		ArrayList <Estudiante> miListaEstu=new ArrayList <Estudiante>();
		
		for(Estudiante v:lista)
			miListaEstu.add(v);
		
		//recorrer un ArrayList
		
		for(int i=0;i<miListaEstu.size();i++)
		{
			System.out.println(miListaEstu.get(i));
		}
		
	}

}




class Estudiante
{
	private String id;
	private String nombre;
	private LocalDate fechaContrato;
	private LocalDate fechaCumple;
	private boolean repetidor;
	private double costeMatricula;
	
	public Estudiante() {}
	
	public Estudiante(String id, String nombre, LocalDate fechaContrato)
	{
		this.id=id;
		this.nombre=nombre;
		this.fechaContrato=fechaContrato;
	}
	
	public Estudiante(String id, String nombre, LocalDate fechaContrato, LocalDate fechaCumple, boolean repetidor, double costeMatricula)
	{
		
		this.id=id;
		this.nombre=nombre;
		this.fechaContrato=fechaContrato;
		this.fechaCumple=fechaCumple;
		this.repetidor=repetidor;
		this.costeMatricula=costeMatricula;
		
	}
	
	public String toString()
	{
		String repe="";
		if(repetidor)
			repe=" . es repetidor";
		else	repe="no es repetidor";
		String	msj="El estudiante de ID"+id+" y de nombre "+nombre+" tiene la fecha de contrato: "
	+fechaContrato+" y su fecha de cumple es: "+fechaCumple+" es repetior ."+repe+" la matricula cuesta"+costeMatricula;
		return msj;
	}
	
}