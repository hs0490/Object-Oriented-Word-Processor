package com.himanshu.patterns;

import java.awt.*;
import java.util.Hashtable;

/**
 * Created by hs0490 on 5/7/14.
 */
public class FontFactory {

    private Hashtable<String, Font> fontFactoryTable = new Hashtable<String, Font>();
    private static FontFactory aFontFactory;

    private FontFactory(){}

    public Font getFont(String fontName,int fontStyle,int fontSize) {

        if (! fontFactoryTable.containsKey(fontName+fontStyle+fontSize))
            fontFactoryTable.put(fontName+fontStyle+fontSize,new Font(fontName,fontStyle,fontSize));

        return fontFactoryTable.get(fontName+fontStyle+fontSize);
    }

    public static FontFactory getFontFactoryInstance(){
        if(aFontFactory == null)
            aFontFactory = new FontFactory();
        return aFontFactory;
    }
}




