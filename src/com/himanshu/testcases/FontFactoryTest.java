package com.himanshu.testcases;

import com.himanshu.patterns.FontFactory;
import com.himanshu.patterns.RunArray;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 5/8/14.
 */
public class FontFactoryTest {


    @Test
    public void testGetFont() throws Exception {

        FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
        Font fontA = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
        Font fontB = aFontFactory.getFont("ARIAL",Font.BOLD,12);
        RunArray test = new RunArray();
        test.addRun(0, 3,fontA);
        test.addRun(4, 3,fontB);

        Font actualFont = test.getFont(5);
        Font expectedFont = fontB;
        assertEquals(expectedFont,actualFont);
    }

    @Test
    public void testGetFontFactory() throws Exception {

        FontFactory actualFontFactory = FontFactory.getFontFactoryInstance();
        FontFactory expectedFontFactory = FontFactory.getFontFactoryInstance();
        assertEquals(expectedFontFactory,actualFontFactory);



    }
}
