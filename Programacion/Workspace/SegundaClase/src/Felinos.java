import UTILIDAD.Animales;
public class Felinos extends Animales
{
	
	public Felinos(String nombre, String habitat, boolean extin)
	{
		super(nombre,habitat,extin);
	}
	public Felinos(String nombre, String habitat, boolean extin,String alimen, int patas, String espec, boolean sexo)
	{
		super(nombre,habitat,extin,alimen,patas,espec,sexo);
	}
	public Felinos()
	{
		super();
	}
	
	
	public static void main(String[] args) 
	{
		
		Felinos gato=new Felinos("Gato","La calle",false);
		Felinos tigre=new Felinos("Tigre","Jungla",true,"matorrales",5,"Felino",true);
		Felinos puma=new Felinos();
		puma.setNombre("nela");
		puma.setHabitat("jungla");
		puma.setEspecie("Felino");
		puma.setAlimen("caca");
		puma.setPatas(3);
		puma.setExtin(true);
		puma.setSexo(false);
		
		System.out.println("Nombre: "+gato.getNombre()+" Habitat: "+gato.getHabitat()+" Peligro de extincion: "+gato.isExtin());
		System.out.println("Nombre: "+tigre.getNombre()+" Habitat: "+tigre.getHabitat()+" Peligro de extincion: "+tigre.isExtin()+" Alimentacion: "+tigre.getAlimen()+" Patas: "+tigre.getPatas()+" Especie: "+tigre.getEspecie()+" Sexo: "+tigre.isSexo());
		System.out.println("Nombre: "+puma.getNombre()+" Habitat: "+puma.getHabitat()+" Peligro de extincion: "+puma.isExtin()+" Alimentacion: "+puma.getAlimen()+" Patas: "+puma.getPatas()+" Especie: "+puma.getEspecie()+" Sexo: "+puma.isSexo());
		for(String s:args)
			System.out.print(s+" ");
	}

}
