class Test14_13 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        System.out.print(s1.equals(s2) + ":" + (s1 == s2)); // equalsメゾットはtrueかfalseを判定する
        // equals メソッドは、文字列の内容が同じかどうかを比較。
        // s1(String)、s2(文字列)なので==ではないからfalse。
    }
}
