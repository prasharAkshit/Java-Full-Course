package Basics;

class Human {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

public class T10Encapsulation {

    static void main(String arg[]){

        Human person = new Human();
        //AGE IS A PRIVATE VARIABLE.
        //person.age = 19; won't work.
        person.setName("Akshit");
        person.setAge(19);

        System.out.println(person.getName() + ": " + person.getAge());


    }
}
