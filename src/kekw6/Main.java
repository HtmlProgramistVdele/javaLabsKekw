package kekw6;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
1)З консолі вводиться довільний рядок який містить математичні операції («1+5+8-7*5/4») потрібно вивести на екран результат обчислення даного рядка (Пріоритет виконання операцій не враховувати)
2)Написати метод який заповнить масив довільного розміру числами по зростанню, починаючи з центру масиву ([3,2,1,0,1,2,3])
3)Написати метод який буде читати з консолі довільний рядок в форматі («+Andrew» або «-John»), в залежності від оператора (+ або -) додає в рядок (саме в рядок, НЕ В КОЛЕКЦІЮ) або ж віднімає від нього дане слово(якщо такого слова немає, тоді вивести відповідне повідомлення в консоль). Зробити все в циклі while в якому має бути switch який буде пропонувати варіанти того що можна зробити: 1 – ввести нове значення, 2 – вивести на екран всі введені слова через кому, 3 – вихід з програми.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
///1
        System.out.println(calc("3*2-4/2"));
/// 2
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        arr = fl(arr);
        for (var item : arr) {
            System.out.print(item + ", ");
        }
        System.out.println();

        ////3

        rowControl();

    }

    private static String input1;

    public static int calc(String input) {
        int y, result, counter = 0;
        input1 = input;
        char operator;
        result = getNextInt();
        while (input1.length() != 0) {
            operator = input1.charAt(0);
            input1 = input1.substring(1, input1.length());
            y = getNextInt();

            switch (operator) {
                case '*':
                    result *= y;
                    break;
                case '/':
                    result /= y;
                    break;
                case '-':
                    result -= y;
                    break;
                case '+':
                    result -= y;
                    break;

            }

        }
        return result;
    }

    public static int getNextInt() {
        int counter = -1;
        while (counter < input1.length() - 1 && checkNumber(input1.charAt(counter + 1) + "")) {
            counter++;
        }
        var result = counter != 0 ? Integer.parseInt(input1.substring(0, counter)) : Integer.parseInt(input1.charAt(0) + "");
        input1 = input1.substring(counter + 1, input1.length());
        return result;
    }

    public static boolean checkNumber(String text) {
        try {
            Float.parseFloat(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    //// 2

    public static int[] fl(int[] arr) {
        var adCounter = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = adCounter;
            adCounter++;
        }
        adCounter = 0;
        for (int i = arr.length / 2; i >= 0; i--) {
            arr[i] = adCounter;
            adCounter++;
        }
        return arr;
    }

    //// 3

    public static void rowControl() {
        String str = "";
        String command;
        var scanner = new Scanner(System.in);
        while (true) {
            command = scanner.next();
            String buff;
            switch (command.charAt(0)) {
                case '+':
                    buff = command.substring(1, command.length());
                    if (str.contains(buff)) {
                        System.out.println("Already contains");
                        continue;
                    }
                    str += buff;
                    break;
                case '-':
                    buff = command.substring(1, command.length());
                    if (!str.contains(buff)) {
                        System.out.println("Not Contains");
                        continue;
                    }
                    str = str.replace(buff, "");
                    break;

                default:
                    if (command.contains(".show")) {
                        System.out.println(str);
                        continue;
                    }
                    return;
            }
        }
    }
}

