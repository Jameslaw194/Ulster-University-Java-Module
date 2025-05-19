import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class ClinicTest {

    private Clinic clinic;
    private Dog dog;
    private Cat cat;

    @Before
    public void setUp() {
        clinic = new Clinic("Test Clinic");
        dog = new Dog("Rex", 3, "Gray", 15.5, "Labrador");
        cat = new Cat("Whiskers", 5, "Gray", 4.2, "Siamese");
    }

    @Test
    public void testSpeakMethod() {
        assertEquals("Woof! I am Rex, a 3 year old Labrador dog.", dog.speak());
        assertEquals("Meow! I am Whiskers, a 5 year old Siamese cat.", cat.speak());
        assertEquals("I am a pet named Rex", new Pet("Rex", 3, "Brown", 15.5).speak());
    }

    @Test
    public void testAddPet() {
        System.out.println("Pets added:");
        clinic.addPet(dog);
        clinic.addPet(cat);
        clinic.listPets();
    }

    @Test
    public void testRemovePet() {
        clinic.addPet(dog);
        clinic.removePet("Rex");
        System.out.println("Pets Remaining after removal:");
        clinic.listPets();
    }

    @Test
    public void testSearchPet() {
        clinic.addPet(dog);
        clinic.addPet(cat);
        clinic.searchPet("Rex");
        clinic.searchPet("Whiskers");
        clinic.searchPet("Monty"); //Pet that hasn't been added
    }

    @Test
    public void testClinicReport() {
        clinic.addPet(dog);
        clinic.addPet(cat);
        clinic.clinicReport();
    }

    @Test
    public void testSaveAndLoadData() throws IOException {
        clinic.addPet(dog);
        clinic.addPet(cat);
        clinic.saveToFile();

        Clinic newClinic = new Clinic("New Clinic");
        newClinic.listPets();
    }
}

