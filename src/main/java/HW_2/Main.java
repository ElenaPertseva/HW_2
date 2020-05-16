package HW_2;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(array[i]);
    }

    public static void invertArray(String[] args) {
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = (i - 1) * 3;
        }
        System.out.println(arr[i]);
    }

    public static void InvertArray(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(arr[i]);
    }

    public static void fillDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = 1

        }
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(array);

    }
}

// над 5, 6 и 7 мне еще надо посидеть)