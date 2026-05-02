package OnePiece.test;
import OnePiece.OnePiecePer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnePieceTest {

    @Test
    void testFuncionamientoBasico() {
        OnePiecePer objeto = new OnePiecePer();
        
        assertNotNull(objeto, "El objeto debería crearse correctamente");

    }

    private void assertNotNull(OnePiecePer objeto, String elObjetoDeberíaCrearseCorrectamente) {

    }
}



