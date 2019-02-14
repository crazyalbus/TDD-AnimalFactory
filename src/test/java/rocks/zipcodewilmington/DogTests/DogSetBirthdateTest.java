package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

public class DogSetBirthdateTest {

    @Test
    public void DogSetBirthdayTest() {
        //Given
        String testDogName = "Albie";
        Date testDogBirthday = new Date(2005, 03, 03);
        Integer testDogId = 124;
        Date expectedDogBirthdate = new Date(2005, 03, 04);

        //When
        Dog testDog = new Dog(testDogName, testDogBirthday, testDogId);
        testDog.setBirthDate(expectedDogBirthdate);
        Date actualDogBirthdate = testDog.getBirthDate();

        //Then
        Assert.assertEquals(expectedDogBirthdate, actualDogBirthdate);

    }

}
