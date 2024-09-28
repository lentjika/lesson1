package lesson6;

public class Dog extends Animal {
    public Dog() {
        super.name = "Бобик";
        Animal.dogCount++;
    }

    @Override
    public void run(int l) {
        if(l>500)
            l = 500;
        super.run(l);
    }

    @Override
    public void swim(int l) {
        if(l>10)
            l = 10;
        super.swim(l);
    }
}
