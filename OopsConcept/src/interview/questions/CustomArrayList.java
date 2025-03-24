package interview.questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// custom arraylist to avoid duplicate value
public class CustomArrayList extends ArrayList<Integer> {

    @Override
    public boolean add(Integer item) {
        if(this.contains(item)){
            return true;
        }else{
            return super.add(item);
        }
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);


        //System.out.println(list);

        // set allowing duplicate objects to overcome we need to override equals and hashcode methods

        Set<Student> set=new HashSet<>();

        Student s1=new Student(1, "Rajesh");
        Student s2=new Student(1, "Rajesh");
        Student s3=new Student(2, "Puja");


        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}
