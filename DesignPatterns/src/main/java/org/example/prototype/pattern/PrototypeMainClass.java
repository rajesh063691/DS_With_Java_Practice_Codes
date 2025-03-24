package org.example.prototype.pattern;

public class PrototypeMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);
        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);
        Profession teaProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teaProfession);
    }
}
