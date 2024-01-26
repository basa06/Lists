import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>(Arrays.asList("word","longerword","some","texthere"));
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String word = it.next();
            if (word.length()<=5){
                it.remove();
            }
        }
        System.out.println(list);
    }
}