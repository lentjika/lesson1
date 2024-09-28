package lesson6;

public class Cat extends Animal {
    public Cat()
    {
        Animal.catCount++;
        super.name = "Кот";
    }
    @Override
    public void run(int l) {
        if (l > 200)
            l = 200;
        super.run(l);
    }

    @Override
    public void swim(int l) {
        System.out.println(super.name + " не умеет плавать");
    }
}
