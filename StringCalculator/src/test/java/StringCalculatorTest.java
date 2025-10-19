import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void emptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void singleNumberReturnsValue() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void twoNumbersCommaSeparated() {
        assertEquals(6, StringCalculator.add("1,5"));
    }

    @Test
    public void multipleNumbers() {
        assertEquals(15,StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void allowAnyAmountOfNumbers() {
        // large list
        StringBuilder sb = new StringBuilder();
        int expected = 0;
        for (int i=1;i<=20;i++){
            if (i>1) sb.append(",");
            sb.append(i);
            expected += i;
        }
        assertEquals(expected, StringCalculator.add(sb.toString()));
    }

    @Test
    public void newlinesAndCommasAreAllowed() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void customDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
}
