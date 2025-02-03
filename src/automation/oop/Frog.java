package automation.oop;
// Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut

public class Frog {
    private String name;   // Attribut
    private String behavior="Jump";  // man skiljer på attribut och metoider med att metoder har () paranteser

    Frog(String name) {  // Konstruktor med inparameter namn
        this.name = name;  // sätter vi attrributets namn mha this till parameterns namn
    }

    public String getName() {  // String betyder att vi returnerar en Sträng (text)
        return name;   // Om man har något annat än void måste man ha return i metoden
    }

    public void behavior(){
        System.out.println(behavior);
    }

}
