import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box{
    public static <T> void displayArray(List<T> array){
        for(T element: array)
            System.out.println(element);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        numbers.add(6);
        numbers.remove(4);

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        Box.displayArray(numbers);
        Box.displayArray(words);


    }
}