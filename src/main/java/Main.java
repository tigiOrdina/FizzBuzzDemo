public class Main {
    public static void main(String[] args){
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder();
        fizzBuzzBuilder.buildFizzBuzz(1,100).forEach(x -> System.out.println(x.toString()));
    }
}
