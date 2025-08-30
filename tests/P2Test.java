import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P2Test {

    @Test
    void testGradeC() {
        assertEquals("C", P2.determineGrade(550, 5));
    }

    @Test
    void testGradeB() {
        assertEquals("B", P2.determineGrade(600, 15));
    }

    @Test
    void testGradeA() {
        assertEquals("A", P2.determineGrade(750, 22));
    }

    @Test
    void testPeasant() {
        assertEquals("Peasant", P2.determineGrade(300, 5));
    }
}