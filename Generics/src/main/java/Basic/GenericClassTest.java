package Basic;

public class GenericClassTest {

    public static void main(String[] args) {
        Generic<Integer> iObj = new Generic<Integer>(75);
        iObj.showType();
        int v = iObj.getObj();
        System.out.println("Value:" + v);


        Generic<String> strObj = new Generic<String>("This is a generic string test");
        iObj.showType();
        int str = iObj.getObj();
        System.out.println("Value:" + v);


    }

}
