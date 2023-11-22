/*
 * What's a class?
 * A class is a blueprint for creating objects.
 */


public class Person {
    // Attributes
    private String name;        // Name of the person
    private int age;            // Age of the person
    private String occupation;  // Occupation of the person

    //person1 = new Person("jonh", 30, "teacher")
    //person2 = new Person("doe", 20, "student")

    // Constructor
    // This is a special method used for creating an instance of the Person class.
    // It initializes the attributes with the provided values when a new Person object is created.
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Method for walking
    // This method represents an action that a person can perform, in this case, walking.
    // It prints a message indicating that the person is walking.
    public void walk() {
        System.out.println(name + " is walking.");
    }

    // Method for eating
    // This method represents another action that a person can perform, in this case, eating.
    // It prints a message indicating that the person is eating.
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void presentYourSelf(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I am a " + occupation + ".");
    }
}
