package SubTyping;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Container<T> {

    private static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;

    public Container() {
        items = (T[]) new Object[MAX_LENGTH];
    }

    public void addItems(T item) {
        if (currentIndex < MAX_LENGTH) {
            items[currentIndex++] = item;
        } else {
            System.out.println("Container is full");
        }
    }


    public T getItem(int index) {
        if (index > MAX_LENGTH) {
            throw new ArrayIndexOutOfBoundsException("Index cannot be larger than 10");
        }
        return items[index];
    }

    public void printAll() {
        String result = Arrays.stream(items)
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

    public static void main(String[] args) {
        Container<String> integerContainer = new Container<>();
        integerContainer.addItems("Hello world");
        integerContainer.addItems("from my generics");
        integerContainer.printAll();
    }
}
