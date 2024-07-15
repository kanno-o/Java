interface MyFunction {
    String foo(int x);
    MyFunction mf = x -> x + ""; // ラムダ式で簡潔に記述する
}