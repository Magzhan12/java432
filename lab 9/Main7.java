class Outer {
    class Inner {
        void show() {
            System.out.println("Hello from Inner class");
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}