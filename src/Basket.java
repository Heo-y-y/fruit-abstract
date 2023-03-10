import fruits.Apple;
import fruits.Fruit;
import fruits.Grape;
import fruits.Mango;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Fruit> fruitArrayList = new ArrayList<>();


    //생성자
    public Basket(ArrayList<Fruit> fruitArrayList) {
        this.fruitArrayList = fruitArrayList;
    }

    //소개 함수
    public void printBasket() {
        for (int i = 0; i < fruitArrayList.size(); i++) {
            fruitArrayList.get(i).fruitName();

        }
    }

    // 가격 함수
    public void printTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < fruitArrayList.size(); i++) {
            totalPrice += fruitArrayList.get(i).getPrice();
        }
        System.out.printf("총 가격 : %d원\n", totalPrice);
    }

    // 나중에 추가된 과일들 과일 이름과 색깔 출력 함수
    public void printFruitsColor() {
        for (int i = 0; i < fruitArrayList.size(); i++) {
            fruitArrayList.get(i).fruitColor();
        }
    }
}
