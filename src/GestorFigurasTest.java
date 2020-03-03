public class GestorFigurasTest {

    public static void main(String [] args){
        //Declaración vector figuras
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(4,10);
        v[1] = new Circulo(4);
        v[2] = new Triangulo(5, 6);
        v[3] = new Cuadrado(4);

        //Suma de todas las areas de las figuras
        double suma = GestorFiguras.suma(v);

        //Ordenamos las figuras en orden decreciente
        GestorFiguras.sort(v);

        //Bucle para mostrar en consola las figuras que hay en el vector y su area
        for(int i =0; i<v.length; ++i)
            System.out.println("Figura: " + v[i].getClass().getName() + " -> Area: " + v[i].area());

        //Muestra por consola el area de todas las figuras sumadas
        System.out.println("Area total: " + GestorFiguras.suma(v));
    }
}
