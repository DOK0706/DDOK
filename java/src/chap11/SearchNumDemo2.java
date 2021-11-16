package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class SearchNumDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) li.add(i);

        Collections.shuffle(li);
        Collections.sort(li);
        System.out.println(li);
        System.out.println(Collections.binarySearch(li, 5));

    }
}