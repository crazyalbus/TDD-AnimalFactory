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
        Boolean expectedMammalInheritance = true;


        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);
        Boolean actualAnimalInheritance = (testCat instanceof Mammal);

        //Then
        Assert.assertEquals(expectedMammalInheritance, actualAnimalInheritance);
    }
}
