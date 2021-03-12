package com.pmd47.homework.Homework_9_2;

public class Test {
    public static void main(String[] args) {
        
    	GalaxyNote8 noteEight = new GalaxyNote8("0812345678","DTAC");
    	System.out.println(noteEight.brand + " " + noteEight.model);
    	noteEight.useGearVR();
    	noteEight.transformToPc();
    	noteEight.usePen();
    	noteEight.googlePlay();

    	IphoneX ix = new IphoneX("0812345678","AIS");
    	System.out.println(ix.brand + " " + ix.model);
    	ix.appStore();
    	ix.faceID();;
    	
    	Iphone8 iEight = new Iphone8("082222245","TRUE");
    	System.out.println(iEight.brand + " " + iEight.model);
    	iEight.appStore();
    	iEight.touchID();
 
       	GalaxyS8 sEight = new GalaxyS8("0855556666","DTAC");
    	System.out.println(sEight.brand + " " + sEight.model);
    	sEight.useGearVR();
    	sEight.transformToPc();
    	sEight.googlePlay();
    	
   }
}
