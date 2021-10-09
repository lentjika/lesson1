package lesson6;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run(500);
        d.run(600);
        d.swim(10);
        d.swim(20);
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        Animal a = new Animal();
        a.run(110);

        Cat c = new Cat();
        c.run(200);
        c.run(500);
        c.swim(20);
        System.out.println("Количество котов " + Animal.catCount);
        System.out.println("Количество собак " + Animal.dogCount);
    }
}
