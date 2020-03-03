public class Circulo extends Figura{
    private double r;

    //Constructor circulo
    public Circulo(double r) {
        this.r = r;
    }

    //Calculo area circulo
    public double area() {
        return  Math.PI * r * r;
    }

    @Override
    public int compareTo(Figura figura) {
        return super.compareTo(figura);
    }
}