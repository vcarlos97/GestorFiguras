public class Circulo extends Figura{
    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    public double area() {
        return  Math.PI * r * r;

    }
    
    public static void main(String[] args) {
        Circulo c = new Circulo(4);
        System.out.println(c.area());
    }
}