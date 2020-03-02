public class Triangulo extends Figura {
    private double b;
    private double h;

    public Triangulo(double base, double height) {
        this.b = base;
        this.h = height;
    }

    public double area() {
        return (b * h) / 2;
    }

    @Override
    public int compareTo(Figura figura) {
        return 0;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }
}