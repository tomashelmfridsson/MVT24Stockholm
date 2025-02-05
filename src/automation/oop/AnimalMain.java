package automation.oop;

import java.util.Arrays;
import java.util.Scanner;

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
        System.out.print(dog.getName() + " ");
        dog.behavior();
        dog.behavior(1, 5);

        Animal animal = new Animal("Trex", 100000);
        System.out.print(animal.getName() + " ");
        animal.behavior();


        Scanner scanner = new Scanner(System.in);
        int maxFrogs=3;
        Frog[] frogArray = new Frog[maxFrogs];
        for (int i=0; i<maxFrogs;i++) {
            try {
                System.out.print("Vad skall groda heta? ");
                String name = scanner.nextLine();
                System.out.print("Hur gammal är grodan? ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Hur många gånger skall grodan hoppa? ");
                int iterations = Integer.parseInt(scanner.nextLine());
                System.out.print("Hur långt hoppar grodan? ");
                int length = Integer.parseInt(scanner.nextLine());
                Frog myFrog = new Frog(name, age);
                myFrog.behavior(length, iterations);
                frogArray[i] = myFrog;
            } catch (NumberFormatException nfe) {
                System.out.println("Du måste mata in eiffror för detta fält");
            } catch (Exception e) {
                System.out.println("Något oväntat gick fel");
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
        for (Frog frog:frogArray){
            System.out.print(frog.name);
            System.out.println(frog.age);
            System.out.println(frog.behavior);
            System.out.println();
        }
    }

}
