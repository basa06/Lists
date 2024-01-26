import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("please give me some ints ");
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                int addIndex;
                for (addIndex = 0; addIndex < list.size() && val < list.get(addIndex); addIndex++) ;
                ;
                list.add(addIndex, val);
                for (int v:list){
                    System.out.print(v+" ");
                }
                System.out.println();
            }

        }

        catch (Exception e){
            System.out.println("error "+e);
            System.exit(1);
        }

    }
}