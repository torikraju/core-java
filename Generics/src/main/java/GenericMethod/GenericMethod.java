package GenericMethod;

public class GenericMethod {


    public static void main(String[] args) {

        Integer[] iray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] sray = {"t", "o", "r", "i", "k"};

        printMe(iray);
        printMe(sray);

    }

    private static <T> void printMe(T[] x) {
        for (T t : x)
            System.out.printf("%s ", t);
        System.out.println();
    }
}
