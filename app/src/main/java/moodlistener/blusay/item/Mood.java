package moodlistener.blusay.item;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Michelle on 6/13/2017.
 */

public class Mood {
    private String name;
    private String icon;
    private Color color;
    private String description;
    private ArrayList<Response> responseChoices;
        //returns all types of responses under the specific mood
   // private ArrayList<ResponseSaveData> savedEntries;
        //used in settings for getting saved entries that have already been filled out

    //for slider options, level of each
    private HashMap<String, Integer> sliderLevels;
        //Cheerfulness
        //Irritability
        //Distress

    public Mood (String n, String i, Color c, String d, int cheer, int irrit, int dis)
    {
        name = n;
        icon = i;
        color = c;
        description = d;
        sliderLevels.put("Cheerfulness", cheer);
        sliderLevels.put("Irritability", irrit);
        sliderLevels.put("Distressfulness", dis);


    }
}
