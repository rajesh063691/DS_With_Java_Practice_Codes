package org.example.abstract_factory.pattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(boolean isTrainee) {
        if (isTrainee) {
            return new TraiineeProfessionAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }
    }
}
