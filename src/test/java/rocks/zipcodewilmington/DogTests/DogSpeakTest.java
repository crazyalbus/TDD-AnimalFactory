package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

public class DogSpeakTest {

    @Test
    public void dogSpeakTest() {
        //Given
        String testDogName = "Albie";
        Date testDogBirthday = new Date(2005, 03, 03);
        Integer testDogId = 124;
        String expectedSpeak = "bark!";


        //When
        Dog testDog = new Dog(testDogName, testDogBirthday, testDogId);
        String actualSpeak = testDog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
}
