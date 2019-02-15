package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // DONE - Create tests for `void add(Dog dog)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Dog dog)`
    // DONE - Create tests for `Dog getDogById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void DogHouseAddTest() {
        //Given
        //Given
        String originalDogName = "Albie";
        Date testDogBirthday = new Date(2005, 03, 03);
        Integer testDogId = 121;


        //When
        Dog testDog = new Dog(originalDogName, testDogBirthday, testDogId);
        DogHouse.add(testDog);
//        Dog addedDog = DogHouse.getDogById(testDogId);
//        int addedDogId = addedDog.getId();
//        String addedDogName = addedDog.getName();
//        Date addedDogBirthdate = addedDog.getBirthDate();
//
//        System.out.println(addedDogName + " " + addedDogBirthdate + " " + addedDogId);

        ///Then
        Assert.assertEquals(testDog, DogHouse.getDogById(testDogId));
    }

    @Test
    public void DogHouseRemoveTest() {
        //Given
        //Given
        String originalDogName = "Chickadee";
        Date testDogBirthday = new Date(2017, 04, 04);
        Integer testDogId = 123;


        //When
        Dog testDog = new Dog(originalDogName, testDogBirthday, testDogId);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);

        ///Then
        Assert.assertNull(DogHouse.getDogById(testDogId));
    }

    @Test
    public void DogHouseRemoveByIDTest() {
        //Given
        String originalDogName = "Chickadee";
        Date testDogBirthday = new Date(2017, 04, 04);
        Integer testDogId = 123;


        //When
        Dog testDog = new Dog(originalDogName, testDogBirthday, testDogId);
        DogHouse.add(testDog);
        DogHouse.remove(123);

        //Then
        Assert.assertNull(DogHouse.getDogById(testDogId));
    }

    @Test
    public void DogHouseGetDogByIDTest() {
        //Given
        String originalDogName = "Chickadee";
        Date testDogBirthday = new Date(2017, 04, 04);
        Integer testDogId = 123;


        //When
        Dog testDog = new Dog(originalDogName, testDogBirthday, testDogId);
        DogHouse.add(testDog);

        ///Then
        Assert.assertEquals(testDog, DogHouse.getDogById(123));
    }

    @Test
    public void DogHouseGetNumberofDogs() {
        //Given
        String Dog1Name = "Fitz";
        Date Dog1Birthday = new Date(2017, 04, 04);
        Integer Dog1id = 123;
        String Dog2Name = "Georgie";
        Date Dog2Birthday = new Date(2018, 02, 02);
        Integer Dog2id = 124;
        Integer expectedNumberofDogs = 2;

        //When
        Dog testDog1 = new Dog(Dog1Name, Dog1Birthday, Dog1id);
        DogHouse.add(testDog1);
        Dog testDog2 = new Dog(Dog2Name, Dog2Birthday, Dog2id);
        DogHouse.add(testDog2);

        //Then
        Assert.assertEquals(expectedNumberofDogs, DogHouse.getNumberOfDogs());
    }
}
