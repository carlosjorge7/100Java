package ejercicio61;

public class Empleado 
{
	private String nom;
	private String tel;
	
	private static int numEmpleados = 0;
	
	public Empleado(String nom, String tel) 
	{ 
		//Cada vez que instanciamos un nom y tel, y tenemos 1 empleaados y se suma 1 al contador 
		this.nom=nom;
		this.tel=tel;
		numEmpleados++;
	}
	
	public void setNombre(String nom)
	{
		this.nom=nom;
	}
	public String getNombre() 
	{
		return nom;
	}
	
	public void setTel(String tel) 
	{
		this.tel=tel;
	}
	
	public String getTel() 
	{
		return tel;
	}
	
	public int getNumEmpleados()
	{
		
		return numEmpleados;
	}
}
