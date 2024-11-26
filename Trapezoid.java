class Trapezoid extends Shape {
    private double sideA;
    private double sideB;
    private double height;

    public Trapezoid(double sideA, double sideB, double height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }
    
    public static final double coefficient = 0.5;
    public static final String TRAPEZOID_MESSAGE = "Фігура: трапеція, площа: %.2f кв. од., колір: %s";

    public double getArea() {
        return coefficient * (sideA + sideB) * height;
    }

    public String getDetails() {
        return String.format(TRAPEZOID_MESSAGE, getArea() , color);
    }
}
