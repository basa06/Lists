import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("please give me some ints ");
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (list.contains(val)){
                    list.remove(list.indexOf(val));
                    list.addFirst(val);
                }
                else{
                    list.addFirst(val);

                }
            }
        }
        catch (Exception e){
            System.out.println("error "+e);
            System.exit(1);
        }
        System.out.println(list);
    }
}