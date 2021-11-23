import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzBuilderTest {

    FizzBuzzBuilder fizzBuzzBuilder;

    @Before
    public void before() {
        fizzBuzzBuilder = new FizzBuzzBuilder();
    }

    @Test
    public void testFizzBuzzBuilder() {
        List<FizzBuzz> result = fizzBuzzBuilder.buildFizzBuzz(1,100);
        assert result != null;
        assert result.size() == 100;
    }
}
