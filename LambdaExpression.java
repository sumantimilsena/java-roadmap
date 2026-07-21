import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shiva Hari Timilsena", "Shree Ram", "Mahadev");

        // Pass the lambda directly into the forEach method
        names.forEach(name -> System.out.println("Hello " + name));
    }
}