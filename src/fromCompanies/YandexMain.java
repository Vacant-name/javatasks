//4. Вывести на экран

public class YandexMain {
    public static void main(String[] args) throws Exception {

        Yandex yandex = new Yandex("aasssdddssssa");
        yandex.solveLine();

//        Stream.of(s.split("[^A-Za-zА-Яа-я]+"))
//                .map(String::toLowerCase)
//                .distinct().sorted()
//                .forEach(System.out::println);
    }
}
