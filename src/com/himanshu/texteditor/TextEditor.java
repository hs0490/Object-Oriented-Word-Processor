package com.himanshu.texteditor;

import com.himanshu.patterns.TextCharacter;
import com.himanshu.patterns.TextCharacterFactory;
import com.himanshu.patterns.FontFactory;
import com.himanshu.patterns.RunArray;

import java.awt.*;

/**
 * Created by hs0490 on 5/4/14.
 */
public class TextEditor {

    public static void main(String args[]){

        String text = "ABCDEF ABCD";
        char[] textArray = text.toCharArray();

        FontFactory aFontFactory = FontFactory.getFontFactoryInstance();
        Font fontOne = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
        Font fontTwo = aFontFactory.getFont("ARIAL",Font.BOLD,12);


        RunArray aRun = new RunArray();
        aRun.addRun(0, 3, fontOne); //0 --- 2
        aRun.addRun(3, 3, fontTwo);  //3 -- 5
        aRun.appendRun(6, fontOne); // 5 -- 10

        for(int i=0 ;i <11; i++){
            TextCharacterFactory aTextCharacterFactory = TextCharacterFactory.getCharacterFactoryInstance();
            TextCharacter aTextCharacter = aTextCharacterFactory.getCharacter(textArray[i]); //unicode
            Font characterFont = aRun.getFont(i);
            aTextCharacter.setFont(characterFont);
            if(i==6)
                System.out.println();
        }


    }


}
