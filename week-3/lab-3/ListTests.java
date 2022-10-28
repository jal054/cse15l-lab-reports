import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input1 = Arrays.asList("1", "12", "123", "1234", "12345", "123456");
        assertEquals(Arrays.asList("1", "12", "123", "1234"), ListExamples.filter(input1, new ListExamples()));
    }

    @Test
    public void testMergeNumberStrings() {
        List<String> input1 = Arrays.asList("b", "c", "f", "g", "j");
        List<String> input2 = Arrays.asList("a", "d", "e", "h", "i");

        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), ListExamples.merge(input1, input2));
    }

    @Test
    public void testMergeLetterStrings() {
        List<String> input1 = Arrays.asList("a", "d", "e", "h", "i");
        List<String> input2 = Arrays.asList("b", "c", "f", "g", "j");

        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), ListExamples.merge(input1, input2));
    }
}