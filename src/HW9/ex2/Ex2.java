package HW9.ex2;
/*2) Создать класс Tree с перегруженными конструкторами.
        В классе есть Tree есть поля:
        String type; int height, int coutOfsticks, String colour;

        Конструктор1 принимающий в параметры String type; int height
        и присваивающий значение полям coutOfsticks значение 13,
        colour "Зеленый".

        Конструктор2 принимающий в параметры int height, int coutOfsticks,
        String colour и присваивающий значение полю type "пихта".

        Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
        сolour = "Желтый".

        Конструктор4 который принимает в параметры String type,
        и вызывает внутри себя конструктор 3.

        Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
public class Ex2 {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Дуб", 200);
        Tree tree2 = new Tree(250, 20, "Коричневый");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Береза");

        // Вывод информации о каждом объекте
        System.out.println(tree1.getType() + ", " + tree1.getHeight() + ", " + tree1.getCountOfSticks() + ", " + tree1.getColour());
        System.out.println(tree2.getType() + ", " + tree2.getHeight() + ", " + tree2.getCountOfSticks() + ", " + tree2.getColour());
        System.out.println(tree3.getType() + ", " + tree3.getHeight() + ", " + tree3.getCountOfSticks() + ", " + tree3.getColour());
        System.out.println(tree4.getType() + ", " + tree4.getHeight() + ", " + tree4.getCountOfSticks() + ", " + tree4.getColour());
    }
}
