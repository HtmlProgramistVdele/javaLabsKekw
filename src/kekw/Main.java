package kekw;

import java.util.concurrent.ThreadLocalRandom;
/*
1Створити двовимірний масив, заповнити його випадковими значеннями від 0 до 9 (Random). Вивести його на екран окремим методом (private void printArray(int[][] arr)). Вивести на екран всі парні числа побічної діагоналі.
2Створити метод (private int[] fillArray(int begin, int end, int step)).
Який заповнює масив від begin до end, з кроком в step.
   Приклад : fillArray(0, 10, 2) -> [0, 2, 4, 6, 8, 10] end – begin */
public class Main {

    public static void main(String[] args) {
        var m = new int[4][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = ThreadLocalRandom.current().nextInt(0, 9);
            }
        }
        pA(m);

        System.out.println();
        System.out.println();
        var ar = fA(1, 15, 4);
        for (var item : ar) {
            System.out.print(item +"\t");
        }
    }

    private static void pA(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf(m[i][j] + "\t");
            }
            System.out.printf("\n");
        }

        System.out.printf("\n");
        for (int i = m.length - 1; i > 0; i--) {
            if ((m[i][m.length - i - 1] % 2) == 0)
                System.out.printf(m[i][m.length - i - 1] + "\t");
        }
    }

    private static int[] fA(int b, int e, int s) {
        var counter = 0;
        int[] result = new int[(e / s) +1];
        result[0]=b;
        for (int i = 1; i < result.length; i++) {
            result[i] = counter += s;
        }
        return result;
    }


}
