public class GestorFigurasTest {
    public static void main(String [] args){
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(4,10);
        v[1] = new Circulo(4);
        v[2] = new Triangulo(5, 6);
        v[3] = new Cuadrado(4);
        double suma = GestorFiguras.suma(v);
        GestorFiguras.sort(v);
        for(int i =0; i<v.length; ++i){
            System.out.println("Figura: " + v.getClass().getName());
        }
        System.out.println(GestorFiguras.suma(v));
    }
}
