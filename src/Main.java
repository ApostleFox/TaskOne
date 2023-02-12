import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String sc = null;

    public static void Scan() {
        Scanner scanner = new Scanner(System.in);
        sc = scanner.nextLine();
    }

    public static void main(String[] args) {

        int step = 1;

        final var cats = List.of("Сіамський", "Британський", "Індійський", "Бенгальський");
        final var lengths    = List.of("65см", "45см", "22см");
        final var eyes = List.of("Блакитний", "Зелений", "Жовтий");
        final var numberOfPaws = List.of("1", "2", "3", "4", "5", "6");

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        System.out.println("Оберіть кота");

                while (true) {
                    Scan();
                    if(sc.equals("Вивести")) {
                        secondList.addAll(firstList);
                        firstList.clear();
                        System.out.println(secondList);
                        break;
                    }
                    if(sc.equals("Початок")) {
                        firstList.clear();
                        break;
                    }
                    if (step == 1) {
                        for (String cat : cats) {
                            if (sc.equals(cat)) {
                                firstList.add(sc);
                                step = step + 1;
                                System.out.println("Оберіть довжину");
                            }
                        }
                    }
                    if (step == 2) {
                        for (String length : lengths) {
                            if (sc.equals(length)) {
                                firstList.add(sc);
                                step = step + 1;
                                System.out.println("Оберіть колір очей");
                            }
                        }
                    }
                    if (step == 3) {

                        for (String eye : eyes) {
                            if (sc.equals(eye)) {
                                firstList.add(sc);
                                step = step + 1;
                                System.out.println("Оберіть кількість лап");
                            }
                        }
                    }
                    if (step == 4) {
                        for (String numberOfPaw : numberOfPaws) {
                            if (sc.equals(numberOfPaw)) {
                                firstList.add(sc);
                                step = step + 1;
                            }
                        }
                    }
                    if(step == 5){
                        secondList.addAll(firstList);
                        firstList.clear();
                        System.out.println(secondList);;
                        break;
                    }
                }
        }
    }
