package HW6;

import java.util.Scanner;

public class HmWr6 {
    /*Завдання
    Написати програму "числа", яка загадує випадкове число та пропонує гравцеві його вгадати.

    Технічні вимоги:

    За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
    та пропонує гравцеві через консоль ввести своє ім'я, яке зберігається в змінній name.
    Перед початком на екран виводиться текст: Let the game begin!

    Сам процес гри обробляється у нескінченному циклі.
    Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану
    кількість з тим, що ввів користувач.
    Якщо введене число менше загаданого, програма виводить на екран текст:
    Your number is too small. Please, try again.. Якщо введене число більше за загадане,
    то програма виводить на екран текст: Your number is too big. Please, try again..
    Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!

    Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Let`s play in game.I will guess a number from 0-100 and you will try to guess");
        int[] guessInt = new int[1];
        for (int i = 0; i < guessInt.length; i++) {
            guessInt[i] = (int) (Math.random() * 100);
            // System.out.print(guessInt[0] + " ");
        }
        int resault = 0;
        while (resault != guessInt[0]){
            if (resault == guessInt[0]){
                break;
            }
            int x = scanner.nextInt();
            if (x<guessInt[0]){
                System.out.println("Your number is too small. Please, try again..");
                continue;
            }
            if (x>guessInt[0]){
                System.out.println("Your number is too big. Please, try again..");
                continue;
            }
            resault = resault + x;
        }

        System.out.println("Congratulations, " + name + "!");

    }
}
