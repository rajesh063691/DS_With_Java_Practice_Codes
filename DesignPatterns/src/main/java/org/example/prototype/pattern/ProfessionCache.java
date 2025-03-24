package org.example.prototype.pattern;

import java.util.HashMap;
import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer, Profession>();

    public static Profession getCloneNewProfession(int id) {
        Profession cacheProfessionInstance = professionMap.get(id);
        return (Profession) cacheProfessionInstance.cloneObject();
    }

    public static void loadProfessionCache() {
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id, doc);
       // doc.print();

        Engineer eng = new Engineer();
        eng.id = 2;
        professionMap.put(eng.id, eng);

        Teacher tea = new Teacher();
        tea.id = 3;
        professionMap.put(tea.id, tea);
    }
}
