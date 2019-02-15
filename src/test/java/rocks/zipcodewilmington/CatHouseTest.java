package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfCats()`


    @Test
    public void catHouseAddTest() {
        //Given
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date(2017, 04, 04);
        Integer testCatId = 123;


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        CatHouse.add(testCat);
//        Cat addedCat = CatHouse.getCatById(testCatId);
//        int addedCatId = addedCat.getId();
//        String addedCatName = addedCat.getName();
//        Date addedCatBirthdate = addedCat.getBirthDate();

//        System.out.println(addedCatName + " " + addedCatBirthdate + " " + addedCatId);

        ///Then
        Assert.assertEquals(testCat, CatHouse.getCatById(testCatId));
    }

    @Test
    public void catHouseRemoveTest() {
        //Given
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date(2017, 04, 04);
        Integer testCatId = 123;


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);

        ///Then
        Assert.assertNull(CatHouse.getCatById(testCatId));
    }

    @Test
    public void catHouseRemoveByIDTest() {
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date(2017, 04, 04);
        Integer testCatId = 123;


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        CatHouse.add(testCat);
        CatHouse.remove(123);

        //Then
        Assert.assertNull(CatHouse.getCatById(testCatId));
    }

    @Test
    public void catHouseGetCatByIDTest() {
        //Given
        String originalCatName = "Chickadee";
        Date testCatBirthday = new Date(2017, 04, 04);
        Integer testCatId = 123;


        //When
        Cat testCat = new Cat(originalCatName, testCatBirthday, testCatId);
        CatHouse.add(testCat);

        ///Then
        Assert.assertEquals(testCat, CatHouse.getCatById(123));
    }

    @Test
    public void catHouseGetNumberofCats() {
        //Given
        String cat1Name = "Fitz";
        Date cat1Birthday = new Date(2017, 04, 04);
        Integer cat1id = 123;
        String cat2Name = "Georgie";
        Date cat2Birthday = new Date(2018, 02, 02);
        Integer cat2id = 124;
        Integer expectedNumberofCats = 2;

        //When
        Cat testCat1 = new Cat(cat1Name, cat1Birthday, cat1id);
        CatHouse.add(testCat1);
        Cat testCat2 = new Cat(cat2Name, cat2Birthday, cat2id);
        CatHouse.add(testCat2);

        //Then
        Assert.assertEquals(expectedNumberofCats, CatHouse.getNumberOfCats());
    }
}
