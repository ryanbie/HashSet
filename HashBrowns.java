import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {

    public static void main(String[] args) {

        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        Object[] h = hashbrowns.toArray();

        System.out.println(h[0]);
        //cannot rely on position of adding as the order it comes back because it's a hash set.

        System.out.println(hashbrowns.hashCode());
        //random number from the values

        System.out.println("------------------------");

        Iterator<Integer> it = hashbrowns.iterator();
        while(it.hasNext()) { //if iterator has next value, itll keep going
            System.out.println(it.next());
        }

    }
}
