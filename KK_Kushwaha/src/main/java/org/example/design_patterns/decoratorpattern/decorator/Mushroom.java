package org.example.design_patterns.decoratorpattern.decorator;

import org.example.design_patterns.decoratorpattern.base.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 80;
    }
}
