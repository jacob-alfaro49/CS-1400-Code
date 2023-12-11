//Jacob Alfaro
//CS1400
//Assignment 6
//12-7-23
public class Demo {
    public static void main(String[] args){
        Person person1 = new Person("Steve", 117, "Pizza");
        Person person2 = new Person("Tony", 53, "Burgers");

        SuperHero superhero1 = new SuperHero(person2, "Iron Man", "Flying", "Always learning from my mistakes");
        SuperHero superhero2 = new SuperHero(person1, "Captain America", "Super strength", "I can do this all day");

        //Using both of the Person methods
        System.out.println(person1.equals(person2));
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        // Using all four of the Superhero methods
        superhero1.speak();
        superhero2.speak();

        System.out.println(superhero1.toString());
        System.out.println(superhero2.toString());

        superhero1.catchVillain();
        superhero1.catchVillain();
        superhero2.catchVillain();

        System.out.println("The heros have caught " + SuperHero.villainsCaught() + " villains!");
    }

}

