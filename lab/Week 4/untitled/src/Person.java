public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void celebrateBirthday(){
        age++;
    }
    public int getAge(){
        return age;
    }
    public static void throwParty(Person p) {
        p.celebrateBirthday();
    }

    public static void main(String[] args) {
        Person name = new Person("John", 20);
        System.out.println("Before party: " + name.getAge());
        throwParty(name);
        System.out.println("After party: " + name.getAge());
    }
    
}
