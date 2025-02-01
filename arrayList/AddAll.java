package arrayList;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);

        list1.addAll(list2);
        System.out.println("Combined ArrayList: " + list1);
        for (int num:list2){
            list1.add(num);
        }
        System.out.println("Combined ArrayList: " + list1);
  for (int i=0;i<list2.size();i++){
   
  }
    }
}
