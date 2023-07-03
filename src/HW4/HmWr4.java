package HW4;

import java.util.Scanner;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class HmWr4 {




    public static void main(String[] args) {

     /*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
Которую нужно ввести с клавиатуры в консоль.
Необходимо при помощи только  метода next() класса Scanner
(не используем метод nextLine())
присвоить перемнным типа String следующие значения:
string1 = Я
string2 = тестирую
string3 = замечательно
string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных
создавать нельзя.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() +"\s" + scanner.next() +"\s" + scanner.next() ;

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);*/

    /*2)Пользователь вводит с клавиатуры три целочисленных значения
    На экран выводится информация можно ли из этих сторон
    построить треугольник.*/
       /*System.out.println("Ведите ваше значение(сумма параметров которые вы укажите должна равняться 180\u00B0: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c == 180){
            System.out.println("Вы можете построить тригульник с такими параметрами как вы указали: " + a + "\u00B0 " + b + "\u00B0 " + c + "\u00B0");
        }
        else {
            System.out.println("Сумма чисел которые вы указали не равняеться 180\u00B0");
        }*/
       /* =========================================================================*/
        /*3)Пользователь вводит с клавиатуры свой год рождения.
                На консол выводится информация о его возрасте.
        Используем класс Date как на занятии.
        (P.s пока не затрагиваем момент месяца рождения,
        останавливаемся только на разнице лет. Если вам
        вдруг понадобится преобразовать тип String в int,
        то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).*/

       /*System.out.println("Введите год вашего рождения в 4-х значном формате: ");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        Date currentDate = new Date();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - x;
        System.out.println("Ваш возраст: " + age);*/

       /* 4)Вывести следующие сообщение в отформатированном виде (необходимо добавить спецификаторы формата):
        У вас есть строка:
        Число {X} больше {Y}, и это {True/False}
        Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.
        Для аргументов создаем отдельно переменные, которые запрашиваются для ввода с клавиатуры.
                После ввода с клавиатуры к примеру чисел 5 и 7 должно выводиться сообщение след. типа:
        Вывод: Число 5 болшье 7, и это false.*/
       /*System.out.println("Ведите ваше число для сравнение :");
       Scanner  scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        int x = Integer.parseInt(string1);
        int y = Integer.parseInt(string2);
        boolean t = x>y;
        System.out.printf("Число " + x + " больше " + y + ", и это " +t);*/

        /*5)(Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст:
        "Лучше бы сегодня была пятница".*/
           /*System.out.println("Введите ваше число :");
           Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Понедельник");
        } else if (x == 2) {
            System.out.println("Вторник");
        } else if (x == 3) {
            System.out.println("Среда");
        } else if (x == 4) {
            System.out.println("Четверг");
        } else if (x == 5) {
            System.out.println("Пятница");
        } else if (x == 6) {
            System.out.println("Суббота");
        } else if (x == 7) {
            System.out.println("Воскресение");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }*/
       /* 6)Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа
        и символ - или + или % или / или *.
        На экран выводится резултат действия над двумя введенными числами.
                Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
        /*System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите символ операции (-, +, %, /, *): ");
        char operator = scanner.next().charAt(0);

        double result = operator == '-' ? number1 - number2 : operator == '+' ? number1 + number2 : operator == '%' ? number1 % number2 : operator == '/' ? number1 / number2 : operator == '*' ? number1 * number2 : 0;

        System.out.println("Результат: " + result);*/
        /*7)Используя оператор switch написать программу, которая выводит на
        консоль ссылку для скачивания программы.
                Из выбора программ взять: IntelliJ IDEA, Git, Java.
        Из выбора ОС взять: Linux, macOS, Windows.
                Программа должна спросить пользователя какая программа ему интересна,
                также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том
        что такой программы не существует.
                Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
        что такой ОС не существует.*/
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите программу (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();

        System.out.print("Выберите операционную систему (Linux, macOS, Windows): ");
        String os = scanner.nextLine();

        String downloadLink;

        switch (program.trim()) {
            case "IntelliJ IDEA":
                switch (os.trim()) {
                    case "Linux":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=linux";
                        break;
                    case "macOS":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=mac";
                        break;
                    case "Windows":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section=windows";
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                        return;
                }
                break;
            case "Git":
                switch (os) {
                    case "Linux":
                        downloadLink = "https://git-scm.com/download/linux";
                        break;
                    case "macOS":
                        downloadLink = "https://git-scm.com/download/mac";
                        break;
                    case "Windows":
                        downloadLink = "https://git-scm.com/download/win";
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                        return;
                }
                break;
            case "Java":
                switch (os) {
                    case "Linux":
                        downloadLink = "https://www.java.com/en/download/linux_manual.jsp";
                        break;
                    case "macOS":
                        downloadLink = "https://www.java.com/en/download/mac_download.jsp";
                        break;
                    case "Windows":
                        downloadLink = "https://www.java.com/en/download/";
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                        return;
                }
                break;
            default:
                System.out.println("Такой программы не существует");
                return;
        }

        System.out.println("Ссылка для скачивания: " + downloadLink);*/
    }
    }
