import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CocheTests {
    private static Coche coche;
    private static Coche coche2;

    @BeforeAll
    public static void crearCoche() {
        coche = new Coche();
        coche2 = new Coche();
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

    @ParameterizedTest(name = "Acelerar de {0} a {1}")
    @CsvSource({
            "15, 15",
            "15, 30",
            "10, 40",
            "100, 140"
    })
    public void acelerarVariasVeces(int first, int expectedResult) {
        coche2.acelerar(first);
        Assertions.assertEquals(coche2.getVelocidade(), expectedResult);
    }
}