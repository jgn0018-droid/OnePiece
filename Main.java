package OnePiece;

public class Main {

	public static OnePiecePer[] main(String[] args) {
		OnePiecePer[] Personaje = OnePiecePer.getOnePiecePers();



		OnePiecePer C1 = new OnePiecePer("Monkey D. Luffy", 30000000, "Hito Hito no mi Modelo Nika", OnePiecePer.MUGIWARAS , "Capitán", true, "Humano");
		OnePiecePer C2 = new OnePiecePer("Kaido", 50000000, "Uo Uo no mi Modelo Dragón", "Piratas Bestia", "Capitán", true, "Oni");
		OnePiecePer C3 = new OnePiecePer("Buggy", 30000000, "Bara Bara no mi", "Cross Guild", "Capitán", false, "Humano");
		OnePiecePer C4 = new OnePiecePer("Foxy", 500000, "Noro Noro no mi", "Piratas de Foxy", "Capitán", false, "Humano");


		Personaje[0] = C1;
		Personaje[1] = C2;
		Personaje[2] = C3;
		Personaje[3] = C4;

		for (int i = 0; i < Personaje.length; i++) {
			System.out.println(Personaje[i]);
			Personaje[i].esPeligroso();
			System.out.println();

		}


        return Personaje;
    }

}
