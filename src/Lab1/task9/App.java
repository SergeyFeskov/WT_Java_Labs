package Lab1.task9;

import Lab1.task9.model.Ball;
import Lab1.task9.model.Basket;
import Lab1.task9.model.Color;
import Lab1.task9.service.BasketService;

public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(0.8, Color.GREEN));
        basket.addBall(new Ball(1.1, Color.BLUE));
        basket.addBall(new Ball(0.85, Color.BLUE));
        basket.addBall(new Ball(1.05, Color.RED));

        System.out.println("Count of the blue balls: " + BasketService.getCountOfBlueBalls(basket));
        System.out.println("Weight: " + BasketService.getSumWeight(basket));
    }
}
