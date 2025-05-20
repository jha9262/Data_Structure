import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(14);
        numbers.add(40);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println(min);
        System.out.println(max);


    }

}
