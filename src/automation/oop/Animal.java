package automation.oop;

public class Animal {
    protected String name;
    protected String behavior= "Sleep";
    protected int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void behavior() {
        System.out.println(behavior);
    }

    public void behavior(int length, int iterations){}


}
