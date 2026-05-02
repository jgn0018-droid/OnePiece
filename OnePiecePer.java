package OnePiece;

import java.util.Scanner;

public class OnePiecePer {
	public String Nombre;
	public long recompensa;
	public String frutaDiablo;
	public String tripulacion;
	public String posicion;
	public boolean haki;
	public String especie;
    
    
    public OnePiecePer (){
  	  this.Nombre="";
  	  this.recompensa=0;
  	  this.frutaDiablo="";
  	  this.tripulacion="";
  	  this.posicion="";
  	  this.haki=false;
  	  this.especie="";
  	  
    }
    
    public OnePiecePer (String Nombre, long recompensa, String frutaDiablo, String tripulacion, String posicion, boolean haki, String especie) {
  	  this.Nombre=Nombre;
  	  this.recompensa=recompensa;
  	  this.frutaDiablo=frutaDiablo;
  	  this.tripulacion=tripulacion;
  	  this.posicion=posicion;
  	  this.haki=haki;	
  	  this.especie=especie;
  	  
    }
    
    public void setrecompensa(long recompensa) 
	{
		this.recompensa=recompensa;
	}
	
	public void setfrutaDiablo(String frutaDiablo) 
	{
		this.frutaDiablo=frutaDiablo;
	}
	
  public void settripulacion(String tripulacion) 
	{
		this.tripulacion=tripulacion;
	}
  
  public void sethaki(boolean haki) 
	{
		this.haki=haki;
	}
  
  public void setespecie(String especie) 
 	{
 		this.especie=especie;
 	}
   
  
  public String getNombre()
	{
		return this.Nombre;
	}
	
	public long getrecompensa()
	{
		return this.recompensa;
	}
  
	public String getfrutaDiablo()
	{
		return this.frutaDiablo;
	}
  
	public String gettripulacion()
	{
		return this.tripulacion;
	}
	
	public String getposicion()
	{
		return this.posicion;
	}
  
	public boolean gethaki()
	{
		return this.haki;
	}
	
	public String getespecie()
	{
		return this.especie;
	}
  
	public String toString() 
	   {
		 return "Nombre: " + this.Nombre + "\n" + "Recompensa: " + this.recompensa + "\n" + "Fruta del Diablo: " + this.frutaDiablo + "\n" + "Tripulación: " + this.tripulacion + "\n" + "Posición: " + this.posicion + "\n" + "Haki: " + this.haki + "\n" + "Especie:" + this.especie;
	   }
	
	public void incrementarRecompensa(long cantidad) {
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce la nueva recompensa:");
		cantidad=teclado.nextLong();
		recompensa=cantidad;
	}
	
	
	public void mostrarInformacion(){
		System.out.println(this.toString());
	}
	
	public void esPeligroso() {
		getCategory(this);
	}

	private static void getCategory(OnePiecePer onePiecePer) {
		if(onePiecePer.recompensa >=100000000 || onePiecePer.haki ==true) {
			System.out.println("Es peligroso");
		}
		else
		{
			System.out.println("No es peligroso");
		}
	}
}
