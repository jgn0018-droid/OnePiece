package OnePiece;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		OnePiecePer[] Personaje=new OnePiecePer[4];

		Scanner teclado =new Scanner (System.in);
		
		OnePiecePer C1 =new OnePiecePer ();
		OnePiecePer C2 =new OnePiecePer ();
		OnePiecePer C3 =new OnePiecePer ();
		OnePiecePer C4 =new OnePiecePer ();
		
		
		
		
		Personaje[0]= C1;
		Personaje[1]= C2;
		Personaje[2]= C3;
		Personaje[3]= C4;
		
		for(int i=0; i<Personaje.length; i++) 
		{
				System.out.println(Personaje[i]);
				Personaje[i].esPeligroso();
				System.out.println();
			
		}

	}

}
