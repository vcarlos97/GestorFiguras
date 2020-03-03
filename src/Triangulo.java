public class Triangulo extends Figura {
    private double b;
    private double h;

    //Constructor triangulo
    public Triangulo(double base, double height) {
        this.b = base;
        this.h = height;
    }

    //Calcular area
    public double area() {
        return (b * h) / 2;
    }

    @Override
    public int compareTo(Figura figura) {
        return super.compareTo(figura);
    }

}