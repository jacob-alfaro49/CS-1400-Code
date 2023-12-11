//Jacob Alfaro
//CS1400
//Assignment 6
//12-7-23
public class SuperHero extends Person{
    // instance variables
    private String superheroName;
    private String superpower;
    private String catchphrase;

    private static int totalNumberVilliansCaught;

    // Constructor that takes in arguments for each instance variable
    public SuperHero(Person person, String n, String sp, String c){
        super(person);
        this.superheroName = n;
        this.superpower = sp;
        this.catchphrase = c;
    }

    //getter and setter methods
    public void setHeroName(String n){
        superheroName = n;
    }
    public void setPower(String p){
        superpower = p;
    }
    public void setCatchphrase(String c){
        catchphrase = c;
    }
    public String getHeroName(){
        return superheroName;
    }
    public String getPower(){
        return superpower;
    }
    public String getCatchphrase(){
        return catchphrase;
    }

    // a method called speak to print out the superhero's catchphrase
    public void speak(){
        System.out.println(catchphrase);
    }

    // a toString method
    public String toString(){
        String str = "SuperHero name: " + superheroName +
                "\nSuperpower: " + superpower;
        return str;
    }

    public static void catchVillain(){
        totalNumberVilliansCaught++;
    }

    public static int villainsCaught(){
        return totalNumberVilliansCaught;
    }
}
