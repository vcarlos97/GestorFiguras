public class Rectangulo extends Figura{
    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }

    @Override
    public double area() {
        return (l1*l2);
    }

    public static void main(String[] args){
        Rectangulo r = new Rectangulo(4,10);
        System.out.println(r.area());
    }
}
