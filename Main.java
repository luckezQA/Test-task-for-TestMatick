import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public enum Color {
        RED("червоний"),
        BLUE("синій"),
        GREEN("зелений"),
        YELLOW("жовтий");

        private final String ukrainianName;

        Color(String ukrainianName) {
            this.ukrainianName = ukrainianName;
        }

        public String getUkrainianName() {
            return ukrainianName;
        }

        public static Color getRandomColor() {
            Color[] colors = Color.values();
            Random random = new Random();
            return colors[random.nextInt(colors.length)];
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Shape> shapes = new ArrayList<>();

        int numberOfShapes = random.nextInt(10) + 1;

        for (int i = 0; i < numberOfShapes; i++) {
            int shapeType = random.nextInt(4);
            Color color = Color.getRandomColor();

            switch (shapeType) {
                case 0 -> shapes.add(new Square(random.nextDouble() * 10 + 1, color.getUkrainianName()));
                case 1 -> shapes.add(new Triangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, color.getUkrainianName()));
                case 2 -> shapes.add(new Circle(random.nextDouble() * 10 + 1, color.getUkrainianName()));
                case 3 -> shapes.add(new Trapezoid(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, color.getUkrainianName()));
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.getDetails());
        }
    }
}
