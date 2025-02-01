//Given an ArrayList of integers, find the largest element.
package arrayList;
import java.util.ArrayList;


public class LargesElement {
    public static void main(String[] args) {
     


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        System.out.println("the 3rd index is   "+ list.get(2));

        int largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > largest) {
                largest = list.get(i);
            }
        }

        System.out.println("Largest element: " + largest);

    }
}
