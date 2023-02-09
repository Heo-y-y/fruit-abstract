package fruits;

//각 과일 클래스들은 추상화한 상위 클래스를 상속받자
public class Apple extends Fruit{
    public Apple(String name, String color, int price) {
        super(name, color, price);
    }

    public void fruitName() {
        System.out.println("🍎");
    }
}
