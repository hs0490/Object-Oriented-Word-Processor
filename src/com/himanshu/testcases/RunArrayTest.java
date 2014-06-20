package com.himanshu.testcases;

import com.himanshu.patterns.FontFactory;
import com.himanshu.patterns.RunArray;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by hs0490 on 5/8/14.
 */
public class RunArrayTest {
    @Test
    public void testAddRun() throws Exception {

        FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
        Font fontA = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
        Font fontB = aFontFactory.getFont("ARIAL",Font.BOLD,12);

        RunArray test = new RunArray();
        test.addRun(0, 3,fontA);
        test.addRun(3, 3,fontB);

        Font actualFont = test.getFont(2);
        Font expectedFont = fontA;
        assertEquals(expectedFont.getSize(),actualFont.getSize());

    }

    @Test
    public void testAppendRun() throws Exception {
        RunArray test = new RunArray();

        FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
        Font fontA = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
        Font fontB = aFontFactory.getFont("ARIAL",Font.BOLD,12);

        test.addRun(0, 3,fontA);
        test.appendRun(10,fontB);

        Font actualFont = test.getFont(8);
        Font expectedFont = fontB;
        assertEquals(expectedFont.getSize(),actualFont.getSize());

    }

    @Test
    public void testGetFont() throws Exception {

        FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
        Font fontA = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
        Font fontB = aFontFactory.getFont("ARIAL",Font.BOLD,12);
        RunArray test = new RunArray();
        test.addRun(0, 3,fontA);
        test.addRun(3,6,fontA);
        test.appendRun(5,fontB);

        Font actualFont = test.getFont(5);
        Font expectedFont = fontB;
        assertNotSame(expectedFont.getSize(), actualFont.getSize());

    }
}
