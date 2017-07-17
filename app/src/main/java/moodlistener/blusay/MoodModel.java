package moodlistener.blusay;

import java.util.ArrayList;

/**
 * Created by Michelle on 6/13/2017.
 */

public class MoodModel {
    //for current user
    private Account currentUser;
    private Mood selectedMood;
    private String display; //can be "light" or "dark"

    //for saved info
    private AccountUnlocked unlockedAccount;
    private ArrayList<AccountLocked> lockedAccounts;
}
