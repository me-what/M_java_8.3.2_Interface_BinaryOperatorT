public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x*y;

        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(10, -2));
    }
}