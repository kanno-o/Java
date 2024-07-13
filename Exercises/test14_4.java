class Test14_4 {
    static void methodA() {
        try {
            int[] a = new int[3]; // 配列 'a' の長さは3 (インデックスは0, 1, 2)
            a[3] = 10; // インデックス3は存在しないため、ArrayIndexOutOfBoundsExceptionがスローされる。（有効なインデックスは0, 1, 2）
            System.out.print("A"); // ここには到達しない
        } catch(Exception e){
            System.out.print("B");
        }
    }
    static void methodB() {
        try {
            methodA();
            System.out.print("C");
        } catch(Exception e) {
            System.out.print("D");
        }
    }
    public static void main(String[] args) {
        try {
            methodB();
            System.out.print("E");
        } catch(Exception e) {
            System.out.print("F");
        }
    }
    // BCEが出力される
}
