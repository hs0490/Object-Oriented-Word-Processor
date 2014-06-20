package com.himanshu.texteditor;


import java.awt.*;
import java.util.ArrayList;

/**
 * Created by hs0490 on 5/8/14.
 */
public class NormalTextEditorSize {

    public static void main(String args[]){

        System.out.println("===============Size in Normal Case========================");

        System.out.printf("The average size of NormalCharacterWithFont is %.1f bytes%n", new SizeofUtil() {

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

            char[] textArray = text.toCharArray();

            ArrayList<CharacterWithFont> characterList = null;

            // Here, unicode of the character is the character itself..

            @Override
            protected int create() {
                characterList = new ArrayList<CharacterWithFont>();
                for(int i=0; i<textArray.length; i++){
                    Font fontA = new Font("Arial", Font.BOLD,12);
                    CharacterWithFont aCharacter = new CharacterWithFont(textArray[i],fontA);
                    characterList.add(aCharacter);
                }
                return 1;
            }
        }.averageBytes());

    }

    // Class to create character objects which contains both font and unicode within itself.
    static class CharacterWithFont{

        char unicode;
        Font font;

        public CharacterWithFont(char unicode, Font font){
            this.unicode = unicode;
            this.font = font;
        }
    }
}


