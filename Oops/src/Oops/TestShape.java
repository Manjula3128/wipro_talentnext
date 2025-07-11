package Oops;
public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        c.Draw();
        c.Erase();
        t.Draw();
        t.Erase();
        s.Draw();
        s.Erase();
    }
}