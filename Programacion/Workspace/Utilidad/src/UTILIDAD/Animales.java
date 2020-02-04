package UTILIDAD;

public class Animales 
{

	private String nombre;
	private String habitat;
	private String alimen;
	private boolean extin;
	private int patas;
	private String especie;
	private boolean sexo;
	
	public Animales(String n,String h,boolean e)
	{
		nombre=n;
		habitat=h;
		extin=e;
	}
	public Animales(String nombre, String habitat, boolean extin,String alimen, int patas, String espec, boolean sexo)
	{
		this.nombre=nombre;
		this.habitat=habitat;
		this.extin=extin;
		this.alimen=alimen;
		this.patas=patas;
		especie=espec;
		this.sexo=sexo;
		
	}
	public Animales( )
	{
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getAlimen() {
		return alimen;
	}
	public void setAlimen(String alimen) {
		this.alimen = alimen;
	}
	public boolean isExtin() {
		return extin;
	}
	public void setExtin(boolean extin) {
		this.extin = extin;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
}
