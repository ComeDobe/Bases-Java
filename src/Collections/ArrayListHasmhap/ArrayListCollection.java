package Collections.ArrayListHasmhap;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> collection = new ArrayList <String>();

        collection.add("Essai");
        collection.add("Cours java");
        collection.add("Tuto java");
       // collection.add(new Date());

        for(Object object: collection){
            System.out.println(((String) object).toUpperCase());
        }
    }

}
