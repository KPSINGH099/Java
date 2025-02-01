//Find the sum of all elements in the ArrayList.

package arrayList;

import java.util.ArrayList;

public class SumOfElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
