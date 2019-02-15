package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void AnimalFactoryTestDog() {

        //Given
        String testDogName = "Mimi";
        Date testDogDate = new Date(2017, 10, 18);

        //When

        Dog testDog = AnimalFactory.createDog(testDogName, testDogDate);
        DogHouse.add(testDog);
        Dog expectedDog = testDog;
        String expectedTestDogName = expectedDog.getName();
        Date expectedTestDogBirthdate = expectedDog.getBirthDate();

        //Then
        Assert.assertEquals(testDogName, expectedTestDogName);
        Assert.assertEquals(testDogDate, expectedTestDogBirthdate);

    }

    @Test
    public void AnimalFactoryTestCat() {
        //Given
        String testCatName = "Fitz";
        Date testCatDate = new Date(2017, 04, 04);

        //When

        Cat testCat = AnimalFactory.createCat(testCatName, testCatDate);
        CatHouse.add(testCat);
        Cat expectedCat = testCat;
        String expectedTestCatName = expectedCat.getName();
        Date expectedTestCatBirthdate = expectedCat.getBirthDate();

        //Then
        Assert.assertEquals(testCatName, expectedTestCatName);
        Assert.assertEquals(testCatDate, expectedTestCatBirthdate);

    }
}
