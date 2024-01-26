import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("please give me some ints ");
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNextDouble()) {
                list.add(scanner.nextDouble());

                }
            for (int x=list.size()-1; x>=0; x--){
                System.out.println(list.get(x));
            }
        }
        catch (Exception e){
            System.out.println("error "+e);
            System.exit(1);
        }
    }
}
