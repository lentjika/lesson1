package lesson7;

public class lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

        System.out.println("-----------------");
        Cat[] cats = new Cat[6];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Котик"+i, 10*i);
        }

        for (var value : cats) {
            plate.info();
            value.eat(plate);
            plate.info();
        }

        plate.addFood(100);
        plate.info();
    }
}

