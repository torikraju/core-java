package Basic;

public class Tuple<X, Y> {

    private X x;
    private Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showTypes() {
        System.out.println("Type of X is:" + x.getClass().getName() + " and Value:" + x);
        System.out.println("Type of Y is:" + y.getClass().getName() + " and Value:" + y);
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Hello", "World");
        tuple.showTypes();

        Tuple<String, Tuple<Integer, String>> tupleInsideTuple = new Tuple<>("Torikul", new Tuple<>(28, "age"));
        tupleInsideTuple.showTypes();

    }

}
