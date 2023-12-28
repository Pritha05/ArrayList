import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(202);
        list.add(111);
        list.add(222);
        list.add(110);
        list.add(220);

        // To traverse ArrayList
        for (int loop : list) {
            System.out.println(loop);
        }

        // To find the length of ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // To check if element exists or not in ArrayList
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (list.contains(n)) {
            System.out.println("Enteing the number is here: " + n);

        } else {
            System.out.println("Entering the number is missing!!");
        }
        sc.close();

        // To sort ArrayList in Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order :" + list);

        // To remove an element from index of ArrayList
        list.remove(1);
        System.out.println("After removing an element: " + list);

    }

}
