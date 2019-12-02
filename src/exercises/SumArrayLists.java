package exercises;

import java.util.ArrayList;

public class SumArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(3);
        a.add(4);
        a.add(5);
        a.add(1);

        b.add(1);
        b.add(6);

        ArrayList<Integer> result = new ArrayList<>();

        int length = 0;
        if(a.size() > b.size()) {
            length = a.size();
        } else {
            length = b.size();
        }

        for(int i = 0; i < length; i++) {
            int valueA = 0;
            int valueB = 0;
            if (a.size() > i) {
                valueA = a.get(i);
            }

            if (b.size() > i) {
                valueB = b.get(i);
            }
                int sum = valueA + valueB;
                result.add(sum);
            }


        System.out.println(result);

    }
}
