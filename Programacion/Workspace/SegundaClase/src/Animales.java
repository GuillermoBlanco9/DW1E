
public class Animales 
{
	public String habitat;
	public String dieta;
	public String especie,nombre;
	public byte patas;
	public double velocidad;
	
	/*byte son numeros enteros del -128 al 127
	 * int son numeros enteros
	 * el float tiene la caracteristica de que se tienen que terminar en f por ejemplo 50f y su valor de la oma es flotante 5,0 o 500
	 * double tambien es de coma flotante y ocupa mas memoria
	 * character solo se puede poner un caracter por ejemplo "h" "5"
	 * boolena si o no
	 */
	
	
	public static void main(String[] args) 
	{
		 Animales Elefante1=new Animales();
		 Animales Elefante2=new Animales();
		 Animales Boa=new Animales();
		 
		 Elefante1.dieta="Yerba";
		 Elefante2.dieta="Hamburguesas";
		 Boa.dieta="ratones";
		 Elefante1.habitat="Sabana";
		 Elefante2.habitat="Jungla";
		 Boa.habitat="Jungla";
		 Elefante1.velocidad=3.1;
		 Elefante2.velocidad=3.6;
		 Boa.velocidad=0.1;
		 Elefante1.especie="Paquidermo";
		 Elefante2.especie="Paquidermo";
		 Boa.especie="Boa";
		 Elefante1.nombre="Lolo";
		 Elefante2.nombre="paquita";
		 Boa.nombre="Hjose";
		 Elefante1.patas=4;
		 Boa.patas=0;
		 
		 Elefante1.duerme();
		 Elefante2.duerme();
		 Boa.duerme();
		 Elefante1.saltar();
		 Elefante2.saltar();
		 Boa.saltar();
		 Elefante1.beber();
		 
		 Boa.beber();
		 Elefante1.comer();
		 Elefante2.comer();
		 Boa.comer();
		 
		 Elefante1.info();
		 Boa.info();

	}
	public void duerme()
	{
		System.out.println(nombre+" duerme bien");
		
	}
	public void saltar()
	{
		System.out.println("el "+especie+" salta "+velocidad);
		
	}
	public void beber()
	{
		System.out.println("el "+especie+" bebe agua");
		
		
	}
	public void comer()
	{
		System.out.println(nombre+" tiene una dieta de: "+dieta);
		
		
	}
	public void info()
	{
		System.out.println(especie+" tiene:\n "+patas+" patas.");
		
	}
	
	
	
	
	
	
}

