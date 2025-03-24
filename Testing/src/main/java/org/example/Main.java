package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    int[] arr= {
            1,1,1,2,2,3
    };
    int k=2;


    Map<Integer,Integer> mp=new HashMap();


    for(int i=0;i<;i++){
       if(mp.get(arr[i])!=0){

           Integer val=mp.get(i);
           mp.put(i,val++);

       }else{
           mp.put(i,1);
       }
   }

    // mp[1=3,2=2,3=1]
    class Temp{
        int id;
        int value;


        public Temp(int id, int value){
            this.id=id;
            this.value=value;
        }

        public int getId() {
            return id;
        }

        public int getValue() {
            return value;
        }
    }




}

