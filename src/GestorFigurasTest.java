public class GestorFigurasTest {
    public static void main(String [] args){
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(4,10);
        v[1] = new Circulo(4);
        v[2] = new Triangulo(5, 6);
        v[3] = new Cuadrado(4);
        double suma = GestorFiguras.suma(v);
        System.out.println(suma);
    }
}
