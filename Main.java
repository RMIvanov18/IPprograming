public class Main {
    String languages;
    Main(String lang) {
        languages = lang;
        System.out.println(languages + " Programing language");
    }
    public static void main(String[] args) {
        Main obj = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("C");
    }
}