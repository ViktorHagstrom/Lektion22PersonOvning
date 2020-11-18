import java.time.Period;

public class Main {

    public static void main(String[] args) {
	/*
	* 1. Skapa en klass Person som beskriver en person. Definiera följande egenskaper: namn, adress och personnummer.
         Skapa setters och getters.
      2. Skapa en subklass till Person som beskriver en anställd. Spara klassen som Employee.
         Subklassen ska ha nya egenskaper: befattning och lön. Skapa metoder som sätter och hämtar de nya egenskaperna.
         Skapa en metod som höjer lönen för en anställd med 10%
      3. Skapa ett testprogram där du testar allt ovan.
    */

        //Person e = new Employee();
        Employee e = new Employee();
        e.setSalary(10_000);
        System.out.println("Old salary " + e.getSalary());
        System.out.println("-------");

        e.setName("Viktor");
        e.setPosition("Boss");
        e.setAdress("Aasd");
        e.setpNumber("1992-06-28");



        e.raise();
        System.out.println("New salary " + e.getSalary());
        System.out.println(e);
    }
}
