public class Test14_8 {
    public static void main(String[] args) {
        int x = 1, y = 3;
        if(x-- == 0 && y++ >= 3) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
        System.out.print(":" + ((x > 0) ? x + y: x - y));
    }
}
