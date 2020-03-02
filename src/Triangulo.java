public class Triangulo {
    private double b;
    private double h;

    public Triangulo(double base, double height) {
        this.b = base;
        this.h = height;
    }

    public double getAreaTriangle() {
        return (b * h) / 2;
    }
}