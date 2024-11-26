class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    private static final double PI = 3.14159;
    private static final String CIRCLE_MESSAGE = "Фігура: коло, площа: %.2f кв. од., радіус: %.2f од., колір: %s";

    public double getArea() {
                return PI * radius * radius;
            }

    public String getDetails() {
                return String.format(CIRCLE_MESSAGE, getArea(), radius, color);
    }
}