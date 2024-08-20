import java.util.function.Predicate;

public class Test14_23 {
    public static void main(String[] args) {
        Predicate<Integer> pre = (Integer x) -> x % 2 == 0;
        System.out.println(pre.test(4));  // true と出力されます
    }
}
