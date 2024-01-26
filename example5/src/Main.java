import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(11);
        list.add(7);
        ListIterator<Integer> it = list.listIterator();
        it.add(20);
        it.next();
        it.remove();
        it.set(-15);
        it.remove();
        it.remove();
    }
}