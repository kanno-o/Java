import java.util.ArrayList;
class Test14_20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            // ArrayListクラスで要素数を取得するメゾットはsize
        }
    }
}
