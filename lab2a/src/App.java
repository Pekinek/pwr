class A {
    public int f() {return 1;}
}
class B extends A{
    public int f() {return 2;}
}
public class App {
    public static void main(String args[]) {
        B obiektB;
        obiektB.f();
    }
}