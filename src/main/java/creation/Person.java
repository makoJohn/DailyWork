package creation;

/**
 *
 */
public class Person {
    String name;
    String pesel;


    public static Person withName(String name) {
        Person person = new Person();
        person.name = name;
        return person;
    }

    public static Person withPesel(String pesel) {
        Person person = new Person();
        person.pesel = pesel;
        return person;
    }
}
