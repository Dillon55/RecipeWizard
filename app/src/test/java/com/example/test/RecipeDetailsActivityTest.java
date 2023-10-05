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

public class RecipeDetailsActivityTest {
    private static final String API_KEY = "ec0037e7aa88429bb9dcea25e871d93d";

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void titletest(){
String recipetitle = "Chicken 65";
RecipeDetailsActivity instance = new RecipeDetailsActivity();
String result = String.valueOf(instance.test(recipetitle));
String expResult = "https://api.spoonacular.com/recipes/information?apiKey="+ API_KEY+ "&recipetitle="+ recipetitle;
        assertEquals(expResult, result);
    }

}
