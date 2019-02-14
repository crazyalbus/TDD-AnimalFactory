package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatGetIdTest {

    @Test
    public void CatGetIdTest() {
        //Given
        String testCatName = "Fitz";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;


        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);
        Integer actualID = testCat.getId();

        //Then
        Assert.assertEquals(testCatId, actualID);



    }


}
