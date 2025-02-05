package automation.oop;

public class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
        this.behavior = "Bark";
    }

    @Override
    public void behavior(int x,int iterations){
        for (int i=0;i<iterations;i++) System.out.print(behavior);
    }
}
