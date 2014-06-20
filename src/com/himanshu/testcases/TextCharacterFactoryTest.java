package com.himanshu.testcases;

import com.himanshu.patterns.TextCharacter;
import com.himanshu.patterns.TextCharacterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by hs0490 on 5/8/14.
 */
public class TextCharacterFactoryTest {
    @Test
    public void testGetCharacter() throws Exception {

        String text = "San Diego State University - Computer Science Department";
        char[] textArray = text.toCharArray();

        TextCharacterFactory aTextCharacterFactory = TextCharacterFactory.getCharacterFactoryInstance();
        TextCharacter actualTextCharacter = aTextCharacterFactory.getCharacter(textArray[3]);
        TextCharacter expectedTextCharacter = aTextCharacterFactory.getCharacter(textArray[4]);

        assertNotSame(expectedTextCharacter, actualTextCharacter);

    }

    @Test
    public void testGetCharacterFactory() throws Exception {

        TextCharacterFactory actualTextCharacterFactory = TextCharacterFactory.getCharacterFactoryInstance();
        TextCharacterFactory expectedTextCharacterFactory = TextCharacterFactory.getCharacterFactoryInstance();
        assertEquals(expectedTextCharacterFactory, actualTextCharacterFactory);

    }
}
