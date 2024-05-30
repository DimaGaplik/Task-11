package app;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getInfo() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");


        System.out.println("1. " + person1.getInfo());
        System.out.println("   " + person2.getInfo());
        System.out.println("   " + person3.getInfo());

        System.out.println();

        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.println("2. " + person4.getInfo());

        person4.setProfession("Дизайнер");
        System.out.println("   " + "(Після оновлення професії)");
        System.out.println("   " + person4.getInfo());
    }
}
