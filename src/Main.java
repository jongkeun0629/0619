import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        // 키 유무 확인. boolean
        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsKey("포도"));

        // 값 유무 확인. boolean
        System.out.println(fruitPrices.containsValue(17980));
        System.out.println(fruitPrices.containsValue(9999));

        // 키가 있으면 값 , 없으면 기본값 반환
        System.out.println(fruitPrices.getOrDefault("사과", 0));
        System.out.println(fruitPrices.getOrDefault("포도", 500));

        // 수정 및 삭제
        fruitPrices.replace("배", 12000);
        fruitPrices.remove("수박");

        // 키, 값 출력
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

        // 키 출력
        for (String key : fruitPrices.keySet())
            System.out.println("key: " + key);
    }
}