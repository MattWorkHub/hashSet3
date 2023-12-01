import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        hashCreation("1","4","7");
    }
    public static void hashCreation(String part1, String part2, String part3){
        HashSet<String> list = new HashSet<String>();
        HashNumbers add1 = new HashNumbers("5");

        list.add(part1);
        list.add(part2);
        list.add(part3);
        list.add(add1.number);

        Iterator<String> iterator  = list.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            if(i == add1.number) {
                iterator.remove();
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("Hashset length is : " + list.toArray().length);
        
        list.clear();

        for(String i : list) {
            System.out.println(i);
        }

        System.out.println("Hashset is clear");
    }
}