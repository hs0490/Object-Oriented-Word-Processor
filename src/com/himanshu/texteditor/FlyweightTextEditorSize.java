package com.himanshu.texteditor;

import com.himanshu.patterns.TextCharacter;
import com.himanshu.patterns.TextCharacterFactory;
import com.himanshu.patterns.FontFactory;
import com.himanshu.patterns.RunArray;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by hs0490 on 5/8/14.
 */
public class FlyweightTextEditorSize {

    public static void main(String args[]){

        System.out.println("===============Size After Using Flyweight==================");

        System.out.printf("The average size of TotalSize is %.1f bytes%n", new SizeofUtil() {

            String text = "CS 635 Advanced Object-Oriented Design & Programming\n" +
                    "Spring Semester, 2014\n" +
                    "Doc 19 Facade & Mediator\n" +
                    "April 24, 2014\n" +
                    "Copyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 Campanile Drive, San Di\n" +
                    "-\n" +
                    "ego, CA 92182-7700 USA. OpenContent (\n" +
                    "http://www.opencontent.org/opl.shtml\n" +
                    ") license de\n" +
                    "-\n" +
                    "fines the copyright on this document.";

            ArrayList<TextCharacter> characterList = null;
            char[] textArray = text.toCharArray();

            @Override
            protected int create() {
                characterList = new ArrayList<TextCharacter>();

                FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
                Font fontOne = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
                Font fontTwo = aFontFactory.getFont("ARIAL",Font.BOLD,12);

                RunArray aRun = new RunArray();
                aRun.addRun(0,115,fontOne ); // 0 -- 114
                aRun.addRun(115, 211, fontTwo); // 114- 325


                for(int i=0 ; i<textArray.length; i++){
                    TextCharacterFactory aTextCharacterFactory = TextCharacterFactory.getCharacterFactoryInstance();
                    TextCharacter aTextCharacter = aTextCharacterFactory.getCharacter(textArray[i]); //unicode
                    if(! characterList.contains(aTextCharacter))
                        characterList.add(aTextCharacter);
                }
                return 1;
            }
        }.averageBytes());

    }





}
