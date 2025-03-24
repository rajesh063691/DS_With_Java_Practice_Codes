package org.example.abstract_factory.pattern;

import org.example.factory.pattern.Engineer;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Docctor")) {
            return new Doctor();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }

        return null;
    }
}
