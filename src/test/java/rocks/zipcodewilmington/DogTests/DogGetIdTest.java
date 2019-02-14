package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

public class DogGetIdTest {

    @Test
    public void DogGetIdTest() {

    //Given
    String testDogName = "Albie";
    Date testDogBirthday = new Date(2005, 03, 03);
    Integer testDogId = 124;


    //When
    Dog testDog = new Dog(testDogName, testDogBirthday, testDogId);
    Integer actualDogId = testDog.getId();

    //Then
    Assert.assertEquals(testDogId, actualDogId);
    }

}
