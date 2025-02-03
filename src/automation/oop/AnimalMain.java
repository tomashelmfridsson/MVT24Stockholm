package automation.oop;

public class AnimalMain {

    public static void main(String[] args) {
        Frog frogBoll = new Frog("Boll", 5); // skapar ett objekt av klassen frog man attributet name= Boll
        System.out.println(frogBoll.getName());
        frogBoll.behavior();
        Frog frog2 = new Frog("Kermit", 7); // skapar ett objekt av klassen frog man attributet name= Boll
        System.out.println(frog2.getName());
        frog2.setBehavior("eat");
        frog2.behavior();
        frog2.behavior(2, 5);

        Dog dog = new Dog("Lufsen", 3);
        System.out.print(dog.getName()+" ");
        dog.behavior();

        Animal animal = new Animal("Trex",100000);
        System.out.print(animal.getName()+" ");
        animal.behavior();

    }

}
