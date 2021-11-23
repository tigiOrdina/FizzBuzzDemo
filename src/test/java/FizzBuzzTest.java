import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void testOne() {
        FizzBuzz result = new FizzBuzz(1);
        assert result.getValue().equals("1");
    }

    @Test
    public void testFizz() {
        FizzBuzz result = new FizzBuzz(3);
        assert result.getValue().equals("Fizz");
    }

    @Test
    public void testBuzz() {
        FizzBuzz result = new FizzBuzz(5);
        assert result.getValue().equals("Buzz");
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz result = new FizzBuzz(15);
        assert result.getValue().equals("FizzBuzz");
    }
}
