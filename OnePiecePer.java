package OnePiece;

public class OnePiecePer {
	private String Nombre;
	private long recompensa;
	private String frutaDiablo;
	private String tripulacion;
	private String posicion;
	private boolean haki;
	private String especie;


	public OnePiecePer () {
  	  this.Nombre=Nombre;
  	  this.recompensa=recompensa;
  	  this.frutaDiablo=frutaDiablo;
  	  this.tripulacion=tripulacion;
  	  
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
		NewClass.askforNewBounty(this);
	}


	public void mostrarInformacion(){
		System.out.println(this.toString());
	}
	
	public void esPeligroso() {
		if(recompensa>=100000000 ||haki==true) {
			System.out.println("Es peligroso");
		}
		else
		{
			System.out.println("No es peligroso");
		}
	}
}
