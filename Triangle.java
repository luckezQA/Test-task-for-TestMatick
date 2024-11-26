class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public static final double coefficient = 0.5;
    public static final String TRIANGLE_MESSAGE = "Фігура: трикутник, площа: %.2f кв. од., гіпотенуза: %.2f од., колір: %s";

    public double getArea() {
        return coefficient * base * height;
    }

    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }

    public String getDetails() {
        return String.format(TRIANGLE_MESSAGE, getArea(), getHypotenuse(), color);
    }
}
