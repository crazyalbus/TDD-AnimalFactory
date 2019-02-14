package rocks.zipcodewilmington.CatTests;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.Food;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

public class CatTestEatFood {

    @Test
    public void catTestEatFood() {
        //Given
        String testCatName = "Fitz";
        Date testCatBirthday = new Date();
        Integer testCatId = 123;
        Integer expectedMeals = 1;



        //When
        Cat testCat = new Cat(testCatName, testCatBirthday, testCatId);
        Food breakfast = new Food("friskies");
        testCat.eat(breakfast);
        Integer actualMeals =  testCat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMeals, actualMeals);
    }
}


//    ensure that when .eat is invoked on an instance of Cat,
//    the numberOfMealsEaten is increased by 1.