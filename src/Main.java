import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6));
       deleteDublicates(list);
       rotateList(list, 2);
    }

    public static List<Integer> deleteDublicates(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(iterator.previousIndex())) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        Collections.rotate(list,k);  // Sorry
        return list;
    }
}