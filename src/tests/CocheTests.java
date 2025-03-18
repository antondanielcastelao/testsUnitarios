import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CocheTests {
    private static Coche coche;

    @BeforeAll
    public static void crearCoche() {
        coche = new Coche();
    }

    @Test
    @DisplayName("Acelera 10km/h")
    public void acelerarTest() {
        // 0 + 10
        coche.acelerar(10);
        Assertions.assertEquals(10, coche.getVelocidade());
    }

    @Test
    @DisplayName("Frena 5km/h")
    public void frenarTest() {
        // 10 - 5
        coche.frenar(5);
        Assertions.assertEquals(5, coche.getVelocidade());
    }
}