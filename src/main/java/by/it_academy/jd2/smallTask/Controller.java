package by.it_academy.jd2.smallTask;

import java.util.List;
import java.util.Scanner;

public class Controller {
    public static List<String> inputNames() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сколько хотите ввести имен");

        int n = scanner.nextInt();

        return Model.logic(n);
    }
}
