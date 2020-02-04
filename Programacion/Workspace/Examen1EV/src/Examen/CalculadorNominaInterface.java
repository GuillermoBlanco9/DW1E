package Examen;

public interface CalculadorNominaInterface 
{
	
	
	String MEDICO="Medico";
	String ENFERMERO="Enfermero";
	String OTRA="otra";
	
	abstract double calculoIRPF();
	abstract double calculoSSocial();
	abstract double calculoSueldoNeto(double a,double b);
	
	
}
