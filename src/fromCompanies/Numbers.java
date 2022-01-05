package fromCompanies;

import java.util.*;
import java.util.regex.Pattern;

/*
    массив может быть свыше 10млн
    массив без дубликатов
    массив с сохранением порядка
    из дубликатов нужно оставлять последний
    из 2 1 4 2 3 правильно 1 4 2 3
    если есть в массиве меньше 0 то ошибку
     */
public class Numbers {
    private final int[] massArr;
    public Numbers(int[] massArr) {
        this.massArr = massArr;
    }

    public void solveArrayList() throws Exception {

        List<Integer> arrayList = new ArrayList<>();
        int doubler;

        for (int i : massArr) {
            if (i < 0) {
                throw new Exception("Error of the sign");
            }
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            } else {
                doubler = i;
                for (int j = 0; j <= arrayList.size(); j++) {
                    if (arrayList.get(j) == doubler) {
                        arrayList.remove(j);
                        arrayList.add(arrayList.size(), doubler);
                        break;
                    }
                }
            }
        }
        System.out.println(arrayList);
    }

//    public void solveLinkedList() throws Exception {
//
//        List<Integer> linkedList = new LinkedList<>();
//        int doubler;
//        for (int i : massArr) {
//
//            if (i < 0) {
//                throw new Exception("Error of the sign");
//            }
//            if (!linkedList.contains(i)) {
//                linkedList.add(i);
//            } else {
//                doubler = i;
//                for (int j = 0; j <= linkedList.size(); j++) {
//                    if (linkedList.get(j) == doubler) {
//                        linkedList.remove(j);
//                        linkedList.add(linkedList.size(), doubler);
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(linkedList);
//    }

//    public void solveLinkedHashSet() throws Exception {
//
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();
//        int doubler;
//
//        for (int i : massArr) {
//            if (i < 0) {
//                throw new Exception("Error of the sign");
//            }
//            if (!linkedHashSet.contains(i)) {
//                linkedHashSet.add(i);
//            } else {
//                doubler = i;
//                for (int j = 0; j <= linkedHashSet.size(); j++) {
//                    if (linkedHashSet.a == doubler) {
//                        linkedHashSet.remove(j);
//                        linkedHashSet.add(linkedHashSet.size(), doubler);
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(linkedHashSet);
//    }
}