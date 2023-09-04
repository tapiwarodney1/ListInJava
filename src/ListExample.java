import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Add integers to the list
        numbers.add(19);
        numbers.add(5);
        numbers.add(0);
        numbers.add(10);

        // Access elements by index
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);
        int thirdNumber = numbers.get(2);

        // Print the list of numbers
        System.out.println("List of Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
