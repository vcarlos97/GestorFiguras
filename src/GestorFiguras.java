import java.lang.reflect.Array;

public class GestorFiguras {

    public static double Figura[];

    public static double suma(Figura [] figura) {
        double aTotal = 0;
        for(int i=0; i < figura.length; ++i)
            aTotal = aTotal + figura[i].area();
    return aTotal;
    }

}
