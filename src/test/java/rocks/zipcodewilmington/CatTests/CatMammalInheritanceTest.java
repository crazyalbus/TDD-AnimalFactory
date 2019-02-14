package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

public class CatMammalInheritanceTest {

    @Test
    public void CatAnimalInheritanceTest() {
        //Given
        String testCatName = "Fitz";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;

        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);

        //Then
        Assert.assertTrue(testCat instanceof Mammal);
    }
}
