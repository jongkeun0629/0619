// 기존 String 클래스
class stringBox {
    private String content;

    public  stringBox(String content) {
        this.content = content;
    }
}

// 제네릭 클래스
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }

    public <E> void printContent(E extraInfo){
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}


public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("스트링 박스");

        System.out.println(stringBox.getContent());
        stringBox.setContent("교체");
        System.out.println(stringBox.getContent());
        stringBox.printContent("추가 내용");
    }
}