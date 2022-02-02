package fromCompanies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeutschePyramidMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.sort(list);

//        List<Integer> checkList = new ArrayList<>();
//        for (int i = 1; i <= list.size(); i++) {
//            checkList.add(i);
//        }
//        System.out.println(checkList);

        int sum = 0;
        int count = 0;
        for (int i = 0; sum <= list.get(i + 1); i++) {
            sum = sum + list.get(i);
            count++;
            System.out.println(sum);
        }
        System.out.println(count);


    }
}
