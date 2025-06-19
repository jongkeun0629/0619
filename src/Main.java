import java.util.Arrays;
import java.util.List;

public class Main {
    // 리스트 내용 출력만 하는 구조. 어떤 형태로 동작하든 상관없음
    public static void printElements(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "CC");

        printElements(numbers);
        printElements(words);
    }
}