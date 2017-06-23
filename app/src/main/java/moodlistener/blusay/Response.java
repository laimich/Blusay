package moodlistener.blusay;

/**
 * Created by Michelle on 6/13/2017.
 */

public class Response {
    //two types
        //ResponseDisplay - ex. music, video, message (where display existing data/info)
        //ResponseSaveData - ex. journal entry, reminder, calendar event (where need to save new data)

    //every response must have, name, linked to xml/java
    //decides whether to save or display only in xml/java
    //all the saved data is saved here, xml/java accesses this response through model's currectResponse var
    //every response has a display that is the xml/java
    private String name;
    private String connectedClass;
    private boolean containsSaveData;
    private String saveData;



}
