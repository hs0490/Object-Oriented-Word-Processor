package com.himanshu.patterns;

import java.util.Hashtable;

/**
 * Created by hs0490 on 5/4/14.
 */
public class TextCharacterFactory {

    private Hashtable  <Character,TextCharacter> characterTable = new Hashtable<Character,TextCharacter>();
    private static TextCharacterFactory aTextCharacterFactory;

    private TextCharacterFactory(){}

    public TextCharacter getCharacter(char unicode){
        TextCharacter aTextCharacter = characterTable.get(unicode);
        if(aTextCharacter == null){
            aTextCharacter = new TextCharacter(unicode);
            characterTable.put(unicode,aTextCharacter);
        }
        return aTextCharacter;

    }

    public static TextCharacterFactory getCharacterFactoryInstance(){
        if(aTextCharacterFactory == null)
            aTextCharacterFactory = new TextCharacterFactory();
            return aTextCharacterFactory;
    }
}
