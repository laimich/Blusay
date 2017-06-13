package moodlistener.blusay;

import java.util.ArrayList;

/**
 * Created by Michelle on 6/13/2017.
 */

public class AccountUnlocked extends Account {

    private String username;
    private ArrayList<Mood> moodResponseInfo;

    public AccountUnlocked() {
        username = "";
        //moodResponseList = new ArrayList<Mood>();
            //add default moods into this list
    }

    @Override
    public String getAccountType() {
        return "unlocked";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void changeUsername(String newUsername) {
        username = newUsername;
    }

    @Override
    public boolean referWithName() {
        //user can only be referred by username
        return false;
    }

    @Override
    public void changeReferSetting(boolean newReferWithName) {
        //only username available, thus refer setting cannot be changed
        return;
    }

    @Override
    public boolean checkPassword(String otherPass) {
        //no password available, thus return true always
        return true;
    }

    @Override
    public ArrayList<Mood> getMoodInfo() {
        return moodResponseInfo;
    }

    @Override
    public void changeMoodInfo(ArrayList<Mood> newMoodInfo) {
        moodResponseInfo = newMoodInfo;
    }
}
