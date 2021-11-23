import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> fizzBuzz(int x, int y) {
        List<String> list = new ArrayList<>();
        for(int i = x; i <= y; i++) {
            StringBuilder str = new StringBuilder();
            if(i % 3 == 0) str.append("Fizz");
            if(i % 5 == 0) str.append("Buzz");
            list.add(str.isEmpty() ? String.valueOf(i) : String.valueOf(str));
        }
        return list;
    }

    public List<String> fizzBuzzStream(int x, int y) {
        return IntStream.rangeClosed(x, y)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : String.valueOf(i)))
                .collect(Collectors.toList());
    }

    public List<String> fizzBuzzHybrid(int x, int y) {
        return IntStream.rangeClosed(x,y)
                .mapToObj(i -> {StringBuilder result = new StringBuilder();
                    if(i % 3 == 0) result.append("Fizz");
                    if(i % 5 == 0) result.append("Buzz");
                    return result.isEmpty() ? String.valueOf(i) : String.valueOf(result);})
                .collect(Collectors.toList());
    }
}
