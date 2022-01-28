import java.util.*;

public class collection {

    public static void main(String[] args) {
        //creating arraylist
        System.out.println("ArrayList");
        ArrayList<String> city=new ArrayList<String>();
        city.add("Chndigarh");
        city.add("Delhi");
        System.out.println(city);

        //creating vector
        System.out.println("\n");
        System.out.println("Vector");
        Vector<Integer> vec = new Vector();
        vec.addElement(15);
        vec.addElement(30);
        vec.addElement(45);
        System.out.println(vec);

        //creating linkedlist
        System.out.println("\n");
        System.out.println("LinkedList");
        LinkedList<String> names=new LinkedList<String>();
        names.add("Alex");
        names.add("John");
        Iterator<String> itr=names.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());

            //creating hashset
            System.out.println("\n");
            System.out.println("HashSet");
            HashSet<Integer> set=new HashSet<Integer>();
            set.add(101);
            set.add(103);
            set.add(102);
            set.add(104);
            System.out.println(set);


        }
    }
}