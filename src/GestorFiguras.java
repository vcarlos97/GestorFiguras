import java.lang.reflect.Array;
import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figura [] figura) {
        double aTotal = 0;
        for(int i=0; i < figura.length; ++i)
            aTotal = aTotal + figura[i].area();
    return aTotal;
    }

    public static void sort(Figura[] figuras){
        Arrays.sort(figuras);
    }
}
