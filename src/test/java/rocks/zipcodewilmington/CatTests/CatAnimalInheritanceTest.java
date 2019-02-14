package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatAnimalInheritanceTest {

    @Test
    public void CatAnimalInheritanceTest() {
        //Given
        String testCatName = "Fitz";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;
        Boolean expectedAnimalInheritance = true;


        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);
        Boolean actualAnimalInheritance = (testCat instanceof Animal);

        //Then
        Assert.assertEquals(expectedAnimalInheritance, actualAnimalInheritance);




    }

}
