abstract class Fruits
{
    abstract void taste();
}
class Apple extends Fruits {
    void taste() {
        System.out.println("Sweet taste");
    }
}
public class Main {

    public static void main(String[] args) {
        Apple a = new Apple();
        a.taste();
    }
}