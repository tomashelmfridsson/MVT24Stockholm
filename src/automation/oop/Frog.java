package automation.oop;
// Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut

public class Frog extends Animal {

   // *******************  // Lägg till ålder också som inparameter   ***********
    Frog(String name,int age) {  // Konstruktor med inparameter namn
        super(name,age);
        this.behavior= "Jump";
    }

    // *********** Lägg till Längd och antal som inparametrar och räkna ut hur långt den hoppar i svaret
    @Override
    public void behavior(int length, int iterations){
        System.out.println("Jump "+(length* iterations)+ " meter");
    }

    public void setBehavior(String behavior){
        this.behavior = behavior;
    }
}
