import org.junit.jupiter.api.Test;

public class MathsTest {
    public Maths maths = new Maths();

    @Test
    public void addition() {
        int a = 5;
        int b = 3;
        assert maths.add(a, b) == 8;
    }


    @Test
    public void subtraction() {
        int a = 5;
        int b = 2;
        assert maths.subtract(a, b) == 2;
    }

    @Test
    public void division() {
        int a = 4;
        int b = 2;
        assert maths.divide(a, b) == 2;
    }

    @Test
    public void multiple() {
        int a = 4;
        int b = 2;
        assert maths.multiple(a, b) == 8;
    }
}
