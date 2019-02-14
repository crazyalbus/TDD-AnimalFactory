package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

public class DogNewDogTest {

    @Test

    public void DogNewDogTest() {

        //Given
        String testDogName = "Albie";
        Date testDogBirthdate = new Date(2005, 03, 03
        );
        int testDogId = 124;

        //When
        Dog testDog = new Dog(testDogName, testDogBirthdate, testDogId);
        String actualDogName = testDog.getName();
        Date actualDogBirthdate = testDog.getBirthDate();
        int actualDogID = testDog.getId();

        //Then
        Assert.assertEquals(testDogName, actualDogName);
        Assert.assertEquals(testDogBirthdate, actualDogBirthdate);
        Assert.assertEquals(testDogId, actualDogID);

    }


}
