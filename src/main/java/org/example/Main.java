package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BottleOfWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleOfWater("Шишкин Лес", 7, 1));
        listProduct.add(new BottleOfWater("Кристальная", 5, 1));
        listProduct.add(new BottleOfWater("Борская", 5, 2));
        listProduct.add(new BottleOfWater("Still", 10, 1));
        listProduct.add(new BottleOfWater("Novoterskaya", 8, 2));
        BottleOfWaterVendingMashine vendingMashine = new BottleOfWaterVendingMashine(listProduct);
        System.out.println("_________________________________________");
        System.out.println(vendingMashine.getProduct("Борская"));
        System.out.println("_________________________________________");

        List<hotDrink> hotDrinkList = new ArrayList<>();
        hotDrinkList.add(new hotDrink("Cacao", 1, 150, 70));
        hotDrinkList.add(new hotDrink("Cappuchino", 3, 150, 60));
        hotDrinkList.add(new hotDrink("Cappuchino", 3, 200, 60));
        hotDrinkList.add(new hotDrink("Latte", 3, 200, 50));
        hotDrinkList.add(new hotDrink("Makiato", 5, 300, 30));
        HotDrinkVendingMashine hotDrinkVending = new HotDrinkVendingMashine(hotDrinkList);
        System.out.println(hotDrinkVending.getProduct("Cappuchino", 60, 200));
        System.out.println("_________________________________________");


    }
}
