package sky.pro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = generateRandomArray();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        double sum = 0;
        int maxSum = 0;
        int[] arr = new int[30];
        //task 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        //task 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        int minSum = arr[0];

        //task 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        double averageAmount = sum / arr.length;
        //task 1

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //task 2
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.Максимальная сумма трат за день составила " + maxSum + " рублей");
        //task 3
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        //task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println(reverseFullName);

        //task 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i + j) % 2 == 0) matrix[i][j] = 1;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //task 6
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = new int[arr2.length];
        for (int i = arr2.length - 1; i > 0; ) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[j] = arr2[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        //task 7
        int[] arr4 = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr4.length / 2; i++) {
            int tmp = arr4[i];
            arr4[i] = arr4[arr4.length - i - 1];
            arr4[arr4.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr4));


        return arr;


    }
}
