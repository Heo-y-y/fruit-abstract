package fruits;

//과일들의 공통점을 찾아서 추상화하여 상위 클래스를 만들자
public class Fruit {
    // 캡슐화
    private String name;
    private String color;
    private int price;

    //생성자
    public Fruit(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void fruitName() {
        System.out.println("나는 과일입니다.");
    }

    public void fruitColor() {
        System.out.printf("%s의 색은 %s입니다.\n", name, color);
    }
}
