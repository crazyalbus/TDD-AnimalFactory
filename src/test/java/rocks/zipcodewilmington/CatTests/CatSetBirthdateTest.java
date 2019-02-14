package rocks.zipcodewilmington.CatTests;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatSetBirthdateTest {
    @Test
    public void CatSetBirthdayTest() {
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date ();
        Integer testCatId = 123;
        String testCatName = "Fitz";
        Date expectedBirthdate = new Date(2017, 04, 04);

        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);
        Date newBirthdate = new Date(2017, 04, 04);
        testCat.setBirthDate(newBirthdate);
        Date actualBirthdate = testCat.getBirthDate();


        //Then
        Assert.assertEquals(expectedBirthdate, actualBirthdate);


    }
}


//    ------ NOTES ------
//    ensure that when .setBirthDate is invoked on an instance of Cat,
//    the name field is being set to the respective value.