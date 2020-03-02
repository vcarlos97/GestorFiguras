public class Triangulo extends Figura {
    private double b;
    private double h;

    public Triangulo(double base, double height) {
        this.b = base;
        this.h = height;
    }

    public double getAreaTriangle() {
        return (b * h) / 2;
    }

    @Override
    public double area() {
        return getAreaTriangle();
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(5,6);
        System.out.println(t.area());
    }
}