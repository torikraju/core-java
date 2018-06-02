package WildCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WildCardArguments {

    public static void print(List<?> lst) {
        String result = lst.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

    private static void printOnlyNumber(List<? super Integer> lst) {
        String result = lst.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(121);
        a.add(122);
        printOnlyNumber(a);

    }

}
