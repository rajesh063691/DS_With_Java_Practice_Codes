package org.example.design_patterns.decoratorpattern;

import org.example.design_patterns.decoratorpattern.base.BasePizza;
import org.example.design_patterns.decoratorpattern.base.ExtraDelight;
import org.example.design_patterns.decoratorpattern.base.FarmHouse;
import org.example.design_patterns.decoratorpattern.decorator.ExtraCheese;
import org.example.design_patterns.decoratorpattern.decorator.Mushroom;

public class test {

    public static void main(String[] args) {
        BasePizza farmHouse = new FarmHouse();
        ExtraCheese extraCheese = new ExtraCheese(farmHouse);
        System.out.println(farmHouse.cost());
        System.out.println(extraCheese.cost());


        BasePizza extraDelight = new ExtraDelight();
        Mushroom mushroom = new Mushroom(extraDelight);
        System.out.println(extraDelight.cost());
        System.out.println(mushroom.cost());
    }


}
