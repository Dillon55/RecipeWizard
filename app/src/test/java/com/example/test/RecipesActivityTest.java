package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(manifest= Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class RecipesActivityTest {
    private static final String API_KEY = "946300d59ddb45d3ad40c5241b043530";

    public RecipesActivityTest(){
    }

    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){
    }

    @Test
    public void queryValidate(){
        String query = "pasta";
        RecipesActivity instance = new RecipesActivity();
        String result = String.valueOf(instance.searchValidate(query));
        String expResult = "https://api.spoonacular.com/recipes/search?apiKey=" + API_KEY + "&query=" + "pasta";
        assertEquals(expResult, result);
    }

}