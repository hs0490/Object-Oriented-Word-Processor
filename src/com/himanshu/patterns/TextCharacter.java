package com.himanshu.patterns;

import java.awt.*;

/**
 * Created by hs0490 on 5/4/14.
 */
public class TextCharacter implements CharacterFlyweight {

    char unicode;

    public TextCharacter(char unicode){
        this.unicode = unicode;
    }


    @Override
    public void setFont(Font characterFont) {
       System.out.println("[TextCharacter: "+this+"] [Unicode: "+this.unicode+"] [Font: "+characterFont+"]");
    }

}
