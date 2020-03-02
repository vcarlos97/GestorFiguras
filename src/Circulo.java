public class Circulo extends Figura{
    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    public double getAreaCirculo() {
        double a = Math.PI * r * r;
        return a;
    }

    @Override
    public double area() {
        return getAreaCirculo();
    }

    public static void main(String[] args) {
        Circulo c = new Circulo(4);
        System.out.println(c.area());
    }
}