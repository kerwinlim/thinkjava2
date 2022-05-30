package chap09_immutable_objects;

public class WrapperClasses {

    public static void main(String[] args) {

        // Integer i = Integer.valueOf(5);
        // System.out.println(i.equals(5));

        Integer x = Integer.valueOf(123);
        Integer y = Integer.valueOf(123);

        if (x==y) {
            System.out.println("x and y are the same object");
        }
        if (x.equals(y)) {
            System.out.println("x and y have the same value");
        }

        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num);



    }
}
