package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

public class DogMammalInheritanceTest {

    @Test

    public void DogMammalInheritanceTest() {

        //Given
        String testDogName = "Albie";
        Date testDogBirthdate = new Date(2005, 04, 04);
        Integer testDogId = 124;

        //When
        Dog testDog = new Dog(testDogName, testDogBirthdate, testDogId);

        //Then
        Assert.assertTrue(testDog instanceof Mammal);

    }


}
