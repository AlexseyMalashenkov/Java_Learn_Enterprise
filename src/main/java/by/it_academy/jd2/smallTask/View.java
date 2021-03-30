package by.it_academy.jd2.smallTask;

import java.util.List;

public class View {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        List<String> list = Controller.inputNames();

        System.out.println(list);
    }
}
