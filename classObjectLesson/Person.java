package classObjectLesson;

import java.util.Objects;

public class Person {
    String name;
    int age;
    boolean maritalStatus;

    public Person() {
        this.name = "Ivan";
        this.age = 30;
        this.maritalStatus = false;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void printFields() {
        System.out.println("name: " + this.name + " age: " + this.age + " maritalStatus: " + this.maritalStatus);
    }

    @Override
    public String toString() {
        return String.format("My name is %s. I’m %d years old. Am I married? %s", name, age, maritalStatus ? "yes" : "no");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, maritalStatus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Person man = (Person) o;
        return man.getName() == this.name &&
                man.getAge() == this.age &&
                man.isMarried() == this.maritalStatus;
    }

    public int howManyJubilees() {
        int jubilees = getAge() / 10;
        return jubilees;
    }

    public void printJubilees() {
        System.out.println("How many jubilees I had?");
        if (this.age == 0){
            System.out.println("Unknown age");
        }else{
            System.out.println("I had " + howManyJubilees() + " jubilees");
        }
    }

    public String nameFirstLetter(){
        return this.name.substring(0,1);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Vasyl");
        Person person3 = new Person("Petro", 69);
        Person person4 = new Person("Dmitro", 30, true);

        Person[] arr = {person1, person2, person3, person4};
        for (Person var : arr) {
            System.out.println(var);
        }

        person4.setAge(35);
        person1.printFields();
        person2.printFields();
        person3.printFields();
        person4.printFields();
        person1.printJubilees();
        person2.printJubilees();
        person3.printJubilees();
        person4.printJubilees();
        System.out.println(person1.nameFirstLetter());
        System.out.println(person2.nameFirstLetter());
        System.out.println(person3.nameFirstLetter());
        System.out.println(person4.nameFirstLetter());


    }
}
