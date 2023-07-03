package HW5;
import java.util.Random;
import java.util.Scanner;
public class HmWr5 {

    public static void main(String[] args) {
        /*1)Написать программу, которая будет считывать введенные пользователем
    слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
    пока пользователь не введет с клавитуры слово STOP.
    Все слова введенные до этого должны отобразится в консоли
    одним предложением.*/
        /*Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Введите слова, чтобы создать предложение (для остановки введите STOP):");

        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;
            }
            sentence.append(word).append(" ");
        }

        System.out.println("Предложение: " + sentence.toString().trim());*/
       /* 2)Написать программу в которой пользователь вводит с клавиатуры число,
                а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " является палиндромом.");
        } else {
            System.out.println(number + " не является палиндромом.");
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;*/
        /*3)Написать проограмму, условно для склада приема металла. Представим, что склад
        может хранить определенный вес металла. Пользователь вводит с
        клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
                то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
                Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса. Программа завершается, когда
        место на складе закончилось.*/
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вместимость склада (вес): ");
        int capacity;
        capacity = scanner.nextInt();
        int availableSpace = capacity;

        while (availableSpace > 0) {
            System.out.print("Введите вес металла для сдачи: ");
            int weight = scanner.nextInt();

            if (weight > availableSpace) {
                System.out.println("Невозможно принять столько металла. Доступное место на складе: " + availableSpace);
            } else if (weight < 5) {
                System.out.println("Невозможно принять металл весом менее 5. Доступное место на складе: " + availableSpace);
            } else {
                availableSpace -= weight;
                System.out.println("Металл принят. Доступное место на складе: " + availableSpace);
            }
        }

        System.out.println("Место на складе закончилось.");*/
        /*4)Создать три массива.
                Первый будет состоять из следующих имен:
        "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
                Второй будет содержать следующие значения типа int:
        10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения:
        "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
                Пользователь вводит три числа с клавиатуры, которые будут соответствовать
        индексам каждого из элементов массивов.
                Пример1. после ввода 3,2,1:
        На экране должно вывестись следующее сообщение:
        "Федя будет идти в магазин в 14:00"
        Пример2. после ввода 1,2,3:
        На экране должно вывестись следующее сообщение:
        "Маша будет идти в тренажерный зал в 14:00"*/
        /*String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс имени (от 0 до 6): ");
        int nameIndex = scanner.nextInt();

        System.out.print("Введите индекс времени (от 0 до 5): ");
        int timeIndex = scanner.nextInt();

        System.out.print("Введите индекс места (от 0 до 5): ");
        int placeIndex = scanner.nextInt();

        String name = names[nameIndex];
        int time = times[timeIndex];
        String place = places[placeIndex];

        System.out.println(name + " будет идти в " + place + " в " + time + ":00");*/
       /* 5)Есть одномерный массив из 10 элементов, заполнен-
                ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/
        /*int[] numbers = generateRandomArray(10);
        printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + target + " найдено в массиве.");
        } else {
            System.out.println("Число " + target + " не найдено в массиве.");
        }
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }*/
        /*6)Заполнить массив на 45 элементов случайными числами
        от -50 до +50. Найти минимальный элемент и вывести его
        на консоль. Найти максимальный элемент и вывести его на
        консоль.*/
        /*int[] numbers = generateRandomArray(45);
        printArray(numbers);

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;*/
    }
    }

