class Test14_6 {
    public static void main(String[] args) {
        int a = 1;
        for(;;) { // for文の丸カッコ内は省略した場合でもセミコロンは必須。
            a = (short)(a + 1);
            if(a + 1 == 3)
            break;
        }
        System.out.print(a);
    }
}