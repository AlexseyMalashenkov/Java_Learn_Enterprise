package by.it_academy.jd2.smallTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {
    public static List<String> logic(int n) {
        List<String> namesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена через Enter.");

        for (int i = 0; i < n; i++) {
            namesList.add(scanner.nextLine());
        }

        return namesList;
    }
}
