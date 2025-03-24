package java8.lamda_expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListItems {

    Integer key;
    String value;

    ListItems(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}

public class ConvertListToMapUsingLambda {
    public static void main(String[] args) {
        List<ListItems> list = new ArrayList<ListItems>();
        // add the member of list
        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Geeks"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Geeks"));

        System.out.print("List :: [");
        list.forEach(
                (n) -> {
                    System.out.print(n.key + " " + n.value + ", ");
                }
        );
        System.out.print("]");
        System.out.println();
        // create map object
        Map<Integer, String> map = new HashMap<>();
        // use lambda to populate the map
        list.forEach(
                (n) -> {
                    map.put(n.getKey(), n.getValue());
                }
        );

        System.out.println("Map :: " + map);
    }
}
