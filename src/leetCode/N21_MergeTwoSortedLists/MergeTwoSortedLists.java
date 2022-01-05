package leetCode.N21_MergeTwoSortedLists;


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode head = list3;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                list3.next = list1; // следущему значению из общего списка присваиваем предыдущий из списка 1
                list1 = list1.next; // предыдущему значению из списка 1 присваиваем следующее в списке 1
            } else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next; // это итератор для цикла
        }

        if (list1 != null) { // проверки чтоб последние элементы вошли и сылке присвоить null
            list3.next = list1;
        } else {
            list3.next = list2;
        }

        System.out.println(head.next);
        return head.next;
    }
}


















//        N21.ListNode common = new N21.ListNode(); // создаем объект обобщенного связного списка
//        N21.ListNode head = common; // создаем переменную типа связного списка для привязки к началу списка
//
//        while (list1 != null && list2 != null) { // пока оба списка непустые делаем
//            if (list1.val < list2.val) { // если 1 значение 1 списка меньше 1 значения 2 списка
//                common.next = list1; // то ссылке обобщенного списка присваиваем 1 список
//                list1 = list1.next; // и 1 списку присваиваем по ссылке все содержимое следущего значения val
//            } else {
//                common.next = list2;
//                list2 = list2.next;
//            }
//            common = common.next; // присвоить по ссылке все содержимое следущего значения val
//        }
//
//        if (list1 != null) { //
//            common.next = list1;
//        } else {
//            common.next = list2;
//        }
//        System.out.println(head.next);
//        return head.next;
//    }

