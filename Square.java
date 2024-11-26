class Square extends Shape {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public static final String SQUARE_MESSAGE = "Фігура: квадрат, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s";

    public double getArea() {
        return side * side;
    }

    public String getDetails() {
        return String.format(SQUARE_MESSAGE, getArea(), side, color);
    }
}
