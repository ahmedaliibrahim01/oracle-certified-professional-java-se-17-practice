package com.ahmedaliibrahim.chapter01.managing_variables_scope;

public class TracingScope {

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        // System.out.println(timeToEat); // DOES NOT COMPILE
        // System.out.println(amountEaten); // DOES NOT COMPILE
        System.out.println(amountOfFood);
    }
}
