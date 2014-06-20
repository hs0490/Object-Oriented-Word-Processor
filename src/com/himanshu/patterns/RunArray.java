package com.himanshu.patterns;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hs0490 on 5/4/14.
 */
public class RunArray {


    private int endIndex;
    private  ArrayList<FontInfo> runArrayList = new ArrayList<FontInfo>();


    public void addRun(int startIndex, int run, Font characterFont){
        endIndex = (startIndex+run)-1;
        runArrayList.add(new FontInfo(startIndex,endIndex,characterFont));
    }

    public void appendRun(int run, Font characterFont){
        int startIndex = endIndex+1;
        endIndex = (startIndex+run)-1;
        runArrayList.add(new FontInfo(startIndex, endIndex, characterFont));
    }

    public Font getFont(int index){
        Iterator<FontInfo> aIterator = runArrayList.iterator();
        while(aIterator.hasNext()){
            FontInfo aFontInfo = aIterator.next();
            // font found
            if(aFontInfo.contains(index)){
                return aFontInfo.characterFont;
            }
        }
        // no font found
        return null;
    }

    public class FontInfo {

        private int startIndex;
        private int endIndex;
        private Font characterFont;

        public FontInfo(int startIndex, int endIndex,Font characterFont){
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.characterFont = characterFont;
        }

        public boolean contains(int index){
            return (index >= startIndex && index <= endIndex);
        }

    }
}
