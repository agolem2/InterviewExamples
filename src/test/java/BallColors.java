package src.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BallColors {
    enum Colors {GREEN, RED, BLUE}

    public static void main(String[] args) {
        List<Colors> list = new ArrayList<>();
        list.add(Colors.RED);
        list.add(Colors.BLUE);
        list.add(Colors.GREEN);
        list.add(Colors.RED);
        list.add(Colors.BLUE);
        list.add(Colors.RED);
        list.add(Colors.BLUE);
        list.add(Colors.GREEN);

        Collections.sort(list, new Comparator<Colors>() {
            @Override
            public int compare(Colors o1, Colors o2) {
                return 0;
            }
        });
        System.out.println(list);
    }
}