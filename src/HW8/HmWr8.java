package HW8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HmWr8 {

    /*public static void printEvenAndOddNumbers(int[] numbers) {*/
        /*1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком, a также нечетные числа списком.*/

        /*System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Нечетные числа:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            }
        }*/
        /*2) Написать перегруженный метод, который может:
не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше сообщение - "%%%%%%%%", ваше число -  $",
         где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
*/
        /*public static void main(String[] args) {
            printMessage();
            printMessage("Привет!");
            printMessage(new String[]{"Java", "Python", "C++"});
            printMessage(new int[]{1, 2, 3, 4, 5});
            printMessage(42, "Отлично!");
        }

    public static void printMessage() {
        System.out.println("Я пустой");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String element : array) {
            sb.append(element).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void printMessage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void printMessage(int number, String message) {
        System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + number);
    }*/
      /* 3) Создать класс Конспект. Класс должен содержать следующие поля:
    Название предмета;
	ФИО студента;
	Количество страниц;
    Год выпуска;
	Цвет обложки.
    Название заведения, где учится студент;*/
        /*public static void main(String[] args) {
            Konspect konspect = new Konspect("Математика", "Иванов Иван Иванович", 50, 2021, "Синий", "Университет им. И. И. Иванова");

            System.out.println("Название предмета: " + konspect.getSubjectName());
            System.out.println("ФИО студента: " + konspect.getStudentName());
            System.out.println("Количество страниц: " + konspect.getPageCount());
            System.out.println("Год выпуска: " + konspect.getYear());
            System.out.println("Цвет обложки: " + konspect.getCoverColor());
            System.out.println("Название заведения: " + konspect.getEducationalInstitution());
        }*/
       /* 4)Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.
*/
        /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов: ");
            int columns = scanner.nextInt();

            int[][] array = new int[rows][columns];
            Random random = new Random();


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = random.nextInt(1001);
                }
            }

            System.out.println("Исходный двумерный массив:");
            printArray(array);

            int[] maxValues = new int[rows];

            for (int i = 0; i < rows; i++) {
                int max = array[i][0];
                for (int j = 1; j < columns; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
                maxValues[i] = max;
            }

            System.out.println("Массив с максимальными значениями:");
            System.out.println(Arrays.toString(maxValues));
        }


    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }*/
    /*5) Написати програму "стрільба по цілі".
    Технічні вимоги:
            	Даний квадрат 5х5, де програма випадковим чином ставить ціль.
            	Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
            	Сам процес гри обробляється у нескінченному циклі.
	гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
            	Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
            	Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
            	Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле. Уражену ціль відзначити як x.
	Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
*/
        /*public static void main(String[] args) {
            int[][] targetBoard = generateTargetBoard();
            boolean[][] shotBoard = new boolean[5][5];
            System.out.println("All Set. Get ready to rumble!");

            while (true) {
                System.out.print("Введіть рядок (1-5): ");
                int row = getUserInput();
                System.out.print("Введіть стовпчик (1-5): ");
                int column = getUserInput();

                if (row >= 1 && row <= 5 && column >= 1 && column <= 5) {
                    if (shotBoard[row - 1][column - 1]) {
                        System.out.println("Ви вже стріляли в цю клітинку. Спробуйте ще раз.");
                    } else {
                        shotBoard[row - 1][column - 1] = true;
                        printUpdatedBoard(targetBoard, shotBoard);

                        if (targetBoard[row - 1][column - 1] == 1) {
                            System.out.println("You have won!");
                            break;
                        }
                    }
                } else {
                    System.out.println("Введене число не відповідає допустимому діапазону. Спробуйте ще раз.");
                }
            }
        }

    public static int[][] generateTargetBoard() {
        int[][] targetBoard = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                targetBoard[i][j] = random.nextInt(2);
            }
        }

        return targetBoard;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введіть число. Спробуйте ще раз.");
            }
        }

        return input;
    }

    public static void printUpdatedBoard(int[][] targetBoard, boolean[][] shotBoard) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (shotBoard[i][j]) {
                    if (targetBoard[i][j] == 1) {
                        System.out.print("x ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }*/
}

