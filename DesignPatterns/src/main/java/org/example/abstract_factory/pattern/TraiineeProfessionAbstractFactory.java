package org.example.abstract_factory.pattern;

import org.example.factory.pattern.Doctor;
import org.example.factory.pattern.Teacher;

public class TraiineeProfessionAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new TraineeDoctor();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
