package HW9.ex3;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public int convertToInt(Object value) {
        if (value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long ||
                value instanceof Character || value instanceof Float || value instanceof Double || value instanceof String) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0;
            } else {
                try {
                    return Integer.parseInt(value.toString());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка при конвертации в int");
                    return 0;
                }
            }
        } else {
            System.out.println("Неподдерживаемый тип данных");
            return 0;
        }
    }

    public double convertToDouble(Object value) {
        if (value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long ||
                value instanceof Character || value instanceof Float || value instanceof Double || value instanceof String) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0.0;
            } else {
                try {
                    return Double.parseDouble(value.toString());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка при конвертации в double");
                    return 0.0;
                }
            }
        } else {
            System.out.println("Неподдерживаемый тип данных");
            return 0.0;
        }
    }

    public String convertToString(Object value) {
        if (value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long ||
                value instanceof Character || value instanceof Boolean || value instanceof Float ||
                value instanceof Double || value instanceof String) {
            return value.toString();
        } else {
            System.out.println("Неподдерживаемый тип данных");
            return null;
        }
    }

    public String getName() {
        return name;
    }
}
