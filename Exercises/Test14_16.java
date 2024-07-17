abstract class Vehicle { }
class Car extends Vehicle { }
class LuxulyCar extends Car { }
class Test14_16 {
    public static void main(String[] args) {
        Object obj = new LuxulyCar();
        Car x = (Car)obj;
        Vehicle a = (Car)obj;
        // Vehicle x = obj; Car x = obj;のような書き方はできない
        //
    }
}
