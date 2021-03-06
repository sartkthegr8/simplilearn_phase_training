import java.util.*;

public class maps {

    public static void main(String [] args) {

        //Hashmap
        HashMap<Integer,String> trio = new HashMap<Integer,String>();
        trio.put(1,"sarthak");
        trio.put(2,"aman");
        trio.put(3,"chetan");

        System.out.println("\nThe elements of Hashmap are ");
        for(Map.Entry m: trio.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //HashTable

        Hashtable<Integer,String> myFam = new Hashtable<Integer,String>();

        myFam.put(4,"Nirvika");
        myFam.put(5,"Kisha");
        myFam.put(6,"Shivanshu");
        myFam.put(7,"Utshav");
        System.out.println("\nThe elements of HashTable are ");
        for(Map.Entry n: myFam.entrySet()) {
            System.out.println(n.getKey()+" "+n.getValue());
        }


        //TreeMap

        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(8,"dehradun");
        map.put(9,"haridwar");
        map.put(10,"delhi");

        System.out.println("\nThe elements of TreeMap are ");
        for(Map.Entry l: map.entrySet()){
            System.out.println(l.getKey()+" "+l.getValue());
        }
    }
}