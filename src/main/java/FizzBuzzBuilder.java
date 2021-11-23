import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzBuilder {

    public List<FizzBuzz> buildFizzBuzz(int x, int y) {
        return IntStream.rangeClosed(x, y)
                .mapToObj(FizzBuzz::new)
                .collect(Collectors.toList());
    }
}
