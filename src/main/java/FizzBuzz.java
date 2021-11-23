public class FizzBuzz {
    private int number;
    private String value;

    public FizzBuzz(int number) {
        this.number = number;
        calculateValue(number);
    }

    private void calculateValue(int number) {
        StringBuilder str = new StringBuilder();
        if(number % 3 == 0) str.append("Fizz");
        if(number % 5 == 0) str.append("Buzz");
        value = str.isEmpty() ? String.valueOf(number) : str.toString();
    }

    public int getNumber() {
        return number;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(number).append(" -> ").append(value);
        return str.toString();
    }
}
