package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatSetNameTest {

    @Test
    public void catSetNameTest() {

        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;
        String testCatName = "Fitz";
        String expectedCatName = "Fitz";


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        testCat.setName("Fitz");
        String actualCatName = testCat.getName();

        //Then
        Assert.assertEquals(expectedCatName, actualCatName);

    }


}
