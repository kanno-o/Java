class Test14_11 {
    static void foo(Integer i) {
        System.out.println(i * 10);
    }
    public static void main(String[] args) {
        int i = 10;
        foo(i); // int型変数iを引数に渡してfooメゾットを呼び出し
        // 「100」が出力される
    }
}
