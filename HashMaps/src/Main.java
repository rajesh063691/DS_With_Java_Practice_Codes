import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//      HashMap<String, Integer> map=new HashMap<>();
//      map.put("Rajesh",100);
//      map.put("Lokesh",101);
//      map.put("Manish",102);
//
//      System.out.println(map.get("Rajesh"));
//      for (var entry: map.entrySet()){
//          System.out.printf(entry.getKey()+":");
//          System.out.println(entry.getValue());
//      }
//
//
//      HashSet<Integer> set=new HashSet<>();
//      set.add(100);
//      set.add(100);
//      set.add(101);
//      set.add(102);
//
//      for( var value: set){
//          System.out.println(value);
//      }


        KarpRabin algo=new KarpRabin();
        algo.search("kumarYaRajeshdav","Rajesh");
    }
}