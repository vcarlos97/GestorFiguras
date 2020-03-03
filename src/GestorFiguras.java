import java.lang.reflect.Array;
import java.util.Arrays;

public class GestorFiguras {

    //Función que suma el area de todas las figuras que se encuentran en el vector
    public static double suma(Figura [] figura) {
        double aTotal = 0;
        for(int i=0; i < figura.length; ++i)
            aTotal = aTotal + figura[i].area();
    return aTotal;
    }

    //Funcion que nos ordena en orden decreciente las figuras que hay en el vector
    public static void sort(Figura[] figuras){
        Arrays.sort(figuras);
    }
}
