package lesson5;

public class Employee {
    String fullName;
    String post;
    String email;
    String phoneNumber;
    int wages;
    int age;

    public Employee(String fullName, String post, String email, String phoneNumber, int wages, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }

    public void newEmployee() {
        if (age > 40) {
            System.out.println("ФИО " + fullName + " Должность: " + post + " email: " + email + " Номер телефона: " + phoneNumber + " Зарплата: " + wages + " Возраст: " + age);
        }
    }
}
