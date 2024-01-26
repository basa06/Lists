import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("type me some words (type '!' to stop):");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String val = scanner.next();
            list.add(val);
            if (val.equals("!")) {
                break;
            }
        }
        System.out.println(list);
        System.out.println("You entered the following words:");
        for (String word : list) {
            System.out.println(word);
        }
        System.out.println("Next round: ");
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            String val = scanner2.next();

            if (val.equals("!")) {
                break;
            }
            for (String i:list){
                if (val.equals(i)) {//add nestedloop to check if the recent input ids found in originsl array
                    System.out.println("hit");
                    break;
                }
            }
        }
    }
}
