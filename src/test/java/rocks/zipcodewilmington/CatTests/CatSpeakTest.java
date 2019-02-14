package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatSpeakTest {

    @Test
    public void catSpeakTest() {
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;
        String expectedSpeak = "meow!";


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        String actualSpeak = testCat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
}
