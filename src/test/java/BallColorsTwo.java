package src.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BallColorsTwo {
    enum Colors {GREEN, RED, BLUE}

    public static void main(String[] args) {
        List<BallColorsSize.Colors> list = new ArrayList<>();
        list.add(BallColorsSize.Colors.RED);
        list.add(BallColorsSize.Colors.BLUE);
        list.add(BallColorsSize.Colors.GREEN);
        list.add(BallColorsSize.Colors.RED);
        list.add(BallColorsSize.Colors.BLUE);
        list.add(BallColorsSize.Colors.RED);
        list.add(BallColorsSize.Colors.BLUE);
        list.add(BallColorsSize.Colors.GREEN);

        Collections.sort(list, new Comparator<BallColorsSize.Colors>() {
            @Override
            public int compare(BallColorsSize.Colors o1, BallColorsSize.Colors o2) {
                return 0;
            }

            public int list(BallColorsSize.Colors o1, BallColorsSize.Colors o2) {
                return 0;
            }
        });
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
            Collections.reverse(list);

            System.out.println(list);
    }
}