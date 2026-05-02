package OnePiece;

import java.util.Scanner;

public class NewClass {
    static void askforNewBounty(OnePiecePer onePiecePer) {
        long cantidad;
        Scanner teclado =new Scanner (System.in);
        System.out.println("Introduce la nueva recompensa:");
        cantidad=teclado.nextLong();
        onePiecePer.recompensa =cantidad;
    }
}
