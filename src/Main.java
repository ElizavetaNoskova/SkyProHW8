
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            int[] arr = generateRandomArray();
            int spendingAmount = 0;
            for (int i = 0; i < arr.length; i++) {
                spendingAmount = spendingAmount + arr[i];
            }
            System.out.println("Сумма трат за месяц составила " + spendingAmount + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSpending = -1;
        int minSpending = 1_000_000;
        for (int i = 0; i < 30; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + "рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float averageSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSpending = averageSpending + arr[i];
        }
        averageSpending = averageSpending / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + "рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}