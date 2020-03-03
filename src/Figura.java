public abstract class Figura implements Comparable<Figura>{
    public abstract double area();

    //Funcion que nos ordenara las figuras en orden decreciente
    @Override
    public int compareTo(Figura figura) {
        return (int) (figura.area() - this.area());
    }
}
