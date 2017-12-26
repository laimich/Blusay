package moodlistener.blusay.item;

import java.util.ArrayList;

/**
 * Created by Michelle on 6/13/2017.
 */

public abstract class Account implements Comparable<Account> {

    public abstract String getAccountType();
    public abstract String getName();
    public abstract String getUsername();
    public abstract void changeUsername(String newUsername);
    public abstract boolean referWithName();
    public abstract void changeReferSetting(boolean newReferWithName);
    public abstract boolean checkPassword(String otherPass);
    public abstract ArrayList<Mood> getMoodInfo();
    public abstract void changeMoodInfo(ArrayList<Mood> newMoodInfo);

    public int compareTo(Account a)
    {
        return getUsername().compareTo(a.getUsername());
    }
}
