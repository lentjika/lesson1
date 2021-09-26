package ru.gb.lesson1;

public class HomeWorkApp {
    public static void main (String [] args) {

    }
}
class printThreeWords {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
class checkSumSign {
    public static void main (String[] args){
        int a=7 ;
        int b=6 ;
        int x = a + b ;
        if ( x >= 0 ) {
            System.out.println("Сумма положительная");
        }
        if ( x < 0 ) {
            System.out.println("Сумма отрицательная");
        }
    }
}
class printColor {
    public static void main (String[] args){
        int value=-7;
        if ( value <= 0 ) {
            System.out.println("Красный");
        }
        if ( 0 < value && value <= 100 ) {
            System.out.println("Желтый");
        }
        if ( value > 100 ) {
            System.out.println("Зеленый");
        }
    }
}
class compareNumbers {
    public static void main(String[] args) {
        int a = 22, b = 37;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}