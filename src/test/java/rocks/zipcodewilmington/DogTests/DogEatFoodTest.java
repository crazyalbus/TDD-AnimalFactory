package rocks.zipcodewilmington.DogTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.Food;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

public class DogEatFoodTest {

    @Test

    public void DogEatFoodTest() {

        //Given
        String testDogName = "Albie";
        Date testDogBirthday = new Date(2005, 03, 03);
        Integer testDogId = 124;
        Integer expectedMeals = 1;

        //When
        Dog testDog = new Dog(testDogName, testDogBirthday, testDogId);
        Food newDogFood = new Food("dinner");
        testDog.eat(newDogFood);
        Integer actualMeals = testDog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMeals, actualMeals);

    }

}
