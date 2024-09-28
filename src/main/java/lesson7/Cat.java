package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSitiy = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("Котенку " + name + " не хватило еды и он не станет есть");
        } else {
            if (p.decreaseFood(appetite))
                this.isSitiy = true;

            System.out.println("Котик " + name + " поел");
        }
        System.out.println("Статус сытости кота " + name + " = " + isSitiy);
    }
}
