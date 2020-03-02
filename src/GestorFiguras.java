import java.lang.reflect.Array;

public class GestorFiguras {

    public static double Figura[];

    public static double suma(Figura [] figura) {
        double aTotal = 0;
        for(int i=0; i < figura.length; ++i)
            aTotal = aTotal + figura[i].area();
    return aTotal;
    }

    public static void main(String[] args){
        Figura[] v = new Figura[3];
        v[0] = new Rectangulo(4,10);
        v[1] = new Circulo(4);
        v[2] = new Triangulo(5, 6);
        double suma = GestorFiguras.suma(v);
        System.out.println(suma);
}
}
