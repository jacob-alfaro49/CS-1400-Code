//Jacob Alfaro
//CS1400
//Assignment 6
//12-7-23

public class Person {
    // Instance variables
    private String name;
    private int age;
    private String favFood;

    // Constructor that takes in arguments for each instance variable
    public Person (String n, int a, String f){
        this.name = n;
        this.age = a;
        this.favFood = f;
    }

    // Copy constructor
    public Person(Person object2)
    {
        name = object2.getName();
        age = object2.getAge();
        favFood = object2.getFavFood();
    }

    // Getter and setter methods
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setNAge(int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
    public void setFavFood(String f)
    {
        favFood = f;
    }
    public String getFavFood()
    {
        return favFood;
    }

    // An equals() method
    public boolean equals(Person object2)
    {
        boolean status;
        if (name.equals(object2.getName()) &&
                (age == object2.getAge() && (favFood.equals(object2.getFavFood()))))
            status = true;
        else
            status = false;
        return status;
    }

    // An toString() method
    public String toString(){
        String str = "Name: " + name +
                "\nAge: " + age +
                "\nFavorite food: " + favFood;
        return str;}
}
