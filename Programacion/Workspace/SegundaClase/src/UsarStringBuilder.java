
public class UsarStringBuilder {

	public static void main(String[] args)
	{
		StringBuilder cadena=new StringBuilder("hoy es viernes!!");
				StringBuilder cadena2=new StringBuilder("Mañana es sabado!");
		cadena.append(" Día 8");
		System.out.println(cadena);
		
		cadena.append(23.45);
		System.out.println(cadena);
		
		cadena.insert(22, ", ");
		System.out.println(cadena);
		
		cadena.insert(0, "Clase DW1E ");
		System.out.println(cadena);
		System.out.println(cadena.reverse());
		cadena.reverse();
		cadena.delete(35,40);
		System.out.println(cadena);
		
		cadena.replace(28, 36, "Caca");
		System.out.println(cadena);
		
		int i=cadena.indexOf("es");
		System.out.println(i);
	}

}
