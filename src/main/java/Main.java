public class Main {
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(1, 100).forEach(System.out::println);
        //fizzBuzz.fizzBuzzStream(1, 100).forEach(System.out::println);
        //fizzBuzz.fizzBuzzHybrid(1, 100).forEach(System.out::println);
    }
}
