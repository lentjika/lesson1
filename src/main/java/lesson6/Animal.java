package lesson6;

public class Animal {
    protected String name  = "Животное";
    public static int dogCount = 0;
    public static int catCount = 0;


    public void run(int l) {
        System.out.println(name + " пробежал " + l);
    }

    public void swim(int l) {
        System.out.println(name + " пропылыл " + l);
    }
}
