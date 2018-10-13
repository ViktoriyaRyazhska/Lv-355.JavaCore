package com.swich.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class Main2Test {

    Dog[] dogs = new Dog[3];

    @Test
    public void checkSame() {

        dogs[0] = new Dog("Test", Breed.AZAWAKH, 11);
        dogs[1] = new Dog("Test", Breed.BORZOI, 6);
        dogs[2] = new Dog("Test 1", Breed.BERGAMASCO, 4);
        assertTrue(Main2.checkSame(dogs));
        dogs[1].setName("Test 2");
        assertFalse(Main2.checkSame(dogs));
    }

    @Test
    public void getOldest() {

        dogs[0] = new Dog("Test", Breed.AZAWAKH, 11);
        dogs[1] = new Dog("Test", Breed.BORZOI, 6);
        dogs[2] = new Dog("Test 1", Breed.BERGAMASCO, 4);

        assertEquals(Main2.getOldest(dogs), dogs[0]);

        dogs[2].setAge(13);
        assertEquals(Main2.getOldest(dogs), dogs[2]);

    }
}