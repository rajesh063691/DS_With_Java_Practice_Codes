package org.example.design_patterns.decoratorpattern.decorator;

import org.example.design_patterns.decoratorpattern.base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 100;
    }

}
