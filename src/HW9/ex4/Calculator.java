package HW9.ex4;
import java.util.Scanner;
public class Calculator {
    private Scanner scanner;

    public Calculator() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Калькулятор запущен.");

        while (true) {
            System.out.print("Введите действие (или Stop для выхода): ");
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт.");
                break;
            }

            if (!isValidAction(action)) {
                System.out.println("Введите корректное действие.");
                continue;
            }

            performAction(action);
        }
    }

    private boolean isValidAction(String action) {
        return action.matches("\\d+[-+*/]\\d+");
    }

    private void performAction(String action) {
        String[] parts = action.split("[-+*/]");

        double operand1 = Double.parseDouble(parts[0]);
        double operand2 = Double.parseDouble(parts[1]);
        char operator = action.charAt(parts[0].length());

        switch (operator) {
            case '+':
                summ(operand1, operand2);
                break;
            case '-':
                minus(operand1, operand2);
                break;
            case '*':
                multiply(operand1, operand2);
                break;
            case '/':
                division(operand1, operand2);
                break;
        }
    }

    public void summ(double a, double b) {
        double result = a + b;
        System.out.println("Результат: " + result);
    }

    public void minus(double a, double b) {
        double result = a - b;
        System.out.println("Результат: " + result);
    }

    public void multiply(double a, double b) {
        double result = a * b;
        System.out.println("Результат: " + result);
    }

    public void division(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка: деление на ноль");
        }
    }
}
