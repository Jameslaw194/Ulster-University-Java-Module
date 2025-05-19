// **********************************************************************
// ChangingPerson.java
//
// Demonstrates parameter passing -- contains a method that should
// change to Person objects.
// ********************************************************************** 
public class ChangePerson {
    // ---------------------------------------------------------
    // Sets up two Person objects, one integer, and one String
    // object. These are sent to a method that should make
    // some changes.
    // ---------------------------------------------------------
    public static void main (String[] args)
    {
        Person p1 = new Person("Sally", 18);
        Person p2 = new Person("Sam", 20);
        int age = 31;
        String name = "Jill";
        System.out.println ("\nParameter Passing... Original values...");
        System.out.println ("person1: " + p1);
        System.out.println ("person2: " + p2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");
        editPerson (p1, p2, age, name);
        System.out.println ("\nValues after calling editPerson...");
        System.out.println ("person1: " + p1);
        System.out.println ("person2: " + p2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");
    }
    // -------------------------------------------------------------------
    // Change the first actual parameter to "Jack - Age 25" and change
    // the second actual parameter to be a person with the age and
    // name given in the third and fourth parameters.
    // -------------------------------------------------------------------
    public static void editPerson (Person p1, Person p2, int age, String name)
    {
        System.out.println ("\nInside changePeople... Original parameters...");
        System.out.println ("person1: " + p1);
        System.out.println ("person2: " + p2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");
        // Make changes
        Person p3 = new Person(name, age);
        p2 = p3;
        name = "Jack";
        age = 25;
//        p1.setName (name);
//        p1.setAge (age);
        // Print changes
        System.out.println ("\nInside editPerson... Changed values...");
        System.out.println ("person1: " + p1);
        System.out.println ("person2: " + p2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");
    } 
}