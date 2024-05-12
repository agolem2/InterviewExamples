package src.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BallColorsSize {
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

            public int list(Colors o1, Colors o2) {
                return 0;
            }
        });
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)

            System.out.println(list.get(i));
    }
}