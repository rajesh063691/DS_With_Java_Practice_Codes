package org.example.prototype.pattern;

public abstract class Profession implements Cloneable {
    public int id;
    public String name;

    abstract void print();

    public Object cloneObject() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
