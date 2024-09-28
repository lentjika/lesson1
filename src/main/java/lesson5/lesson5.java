package lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Иван Иванович Иванов", "генеральный директор", "pups@gmail.com", "89263332211", 12000, 48);
        emplArray[1] = new Employee("Сергеев Сергей Сергеевич", "секретарь", "Serg@gmail.com", "89265554477", 7000, 37);
        emplArray[2] = new Employee("Петров Петр етрович", "охранник", "petr@gmail.com", "89267774477", 5000, 29);
        emplArray[3] = new Employee("Никонов Никон Никонович", "инженер", "nikon@gmail.com", "89265554422", 5000, 57);
        emplArray[4] = new Employee("Платонов Платон Платонович", "связист", "platon@gmail.com", "89995554477", 4000, 19);
        for (int i = 0; i<5; i++)
        {
            emplArray[i].newEmployee();
        }
    }

}
