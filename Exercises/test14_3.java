interface Printable {
    void print(String str);
}
public class test14_3 {
    public static void main(String[] args) {
        // (String data)の他に、dataや(data)の書き方ができる
        Printable p = (String data) -> {
            System.out.print("<<" + data + ">>"); 
        };
        p.print("lambda");
    }
}
