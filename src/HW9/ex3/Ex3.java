package HW9.ex3;

public class Ex3 {
    public static void main(String[] args) {
        Converter converter = new Converter("MyConverter");

        int intValue = converter.convertToInt("123");
        System.out.println("Converted int value: " + intValue);

        double doubleValue = converter.convertToDouble("3.14");
        System.out.println("Converted double value: " + doubleValue);

        String stringValue = converter.convertToString(42);
        System.out.println("Converted string value: " + stringValue);

        String converterName = converter.getName();
        System.out.println("Converter name: " + converterName);
    }
}
