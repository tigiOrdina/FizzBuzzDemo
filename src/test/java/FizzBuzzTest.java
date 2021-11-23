import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void before(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testOne() {
        List<String> result = fizzBuzz.fizzBuzz(1, 1);
        assert result.size() == 1;
        assert result.get(0).equals("1");
    }

    @Test
    public void testFizz() {
        List<String> result = fizzBuzz.fizzBuzz(3, 3);
        assert result.size() == 1;
        assert result.get(0).equals("Fizz");
    }

    @Test
    public void testBuzz() {
        List<String> result = fizzBuzz.fizzBuzz(5, 5);
        assert result.size() == 1;
        assert result.get(0).equals("Buzz");
    }

    @Test
    public void testFizzBuzz() {
        List<String> result = fizzBuzz.fizzBuzz(15, 15);
        assert result.size() == 1;
        assert result.get(0).equals("FizzBuzz");
    }
}
