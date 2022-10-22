package task9.service;

import task9.model.Ball;
import task9.model.Basket;
import task9.model.Color;

public class BasketService {    
    public static int getCountOfBlueBalls(Basket basket) {
        return (int)basket.getBalls().
            stream().
            filter(ball -> ball.getColor().equals(Color.BLUE)).
            count();
    }

    public static double getSumWeight(Basket basket) {
        return basket.getBalls().
            stream()
            .mapToDouble(Ball::getWeight)
            .sum();
    }
}