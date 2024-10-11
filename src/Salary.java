public class Salary {
    //En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
    //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
    public static void main(String[] args) {
        int salary = 8000;
        final double FACTOR = 0.09;
        int salesAmount = 20147;
        double  newSalary = salary + (salesAmount * FACTOR);
        String text = "New" + " salary is " + newSalary;
        System.out.println(text);
    }
}
