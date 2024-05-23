public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int[] numbers1 = {5, 9, 3, 0, 1};
        int[] numbers2 = {5, 6, 7, 8, 9};
        choiceOfTwoBinaryOptions(numbers, 2);
        System.out.println();
        choiceOfTwoBinaryOptions(numbers1, 2);
        System.out.println();
        choiceOfTwoBinaryOptions(numbers2, 2);


    }

    public static int increasingBinarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < numbers[mid]) {
                high = mid - 1;
            } else if (key > numbers[mid]) {
                low = mid + 1;
            } else {
                System.out.print("Позиция числа \"" + key + "\"  в массиве = ");
                return mid;
            }
        }
        System.out.println("Число \"" + key + "\" не найдено.");
        return -1;
    }

    public static int decreasingBinarySearch(int[] numbers, int key) {
        int low = numbers.length - 1;
        int high = 0;

        while (low >= high) {
            int mid = high + (low - high) / 2;
            if (key < numbers[mid]) {
                high = mid + 1;
            } else if (key > numbers[mid]) {
                low = mid - 1;
            } else {
                System.out.print("Позиция числа \"" + key + "\"  в массиве = ");
                return mid;
            }
        }
        System.out.println("Число \"" + key + "\" не найдено.");
        return -1;
    }

    public static int sortingСheck(int[] numbers) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isIncreasing = false;
            } else if (numbers[i] < numbers[i + 1]) {
                isDecreasing = false;
            }
        }

        if (isIncreasing) {
            return 1;
        } else if (isDecreasing) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void choiceOfTwoBinaryOptions(int[] numbers, int target) {
        if (sortingСheck(numbers) == 1) {
            System.out.println("Список отсортирован по возрастанию.");
            System.out.println(increasingBinarySearch(numbers, target));
        } else if (sortingСheck(numbers) == -1) {
            System.out.println("Список отсортирован по убыванию.");
            System.out.println(decreasingBinarySearch(numbers, target));
        } else {
            System.out.println("К данному массиву невозможно применить бинарный поиск, так как он не отсортирован.");
        }
    }
}