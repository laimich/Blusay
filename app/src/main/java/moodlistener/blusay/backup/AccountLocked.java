//package moodlistener.blusay;
//
//import java.util.ArrayList;
//
///**
// * Created by Michelle on 6/13/2017.
// */
//
//public class AccountLocked extends Account {
//
//    private String name;
//    private String username;
//    private boolean referWithName;
//    private String password;
//    private ArrayList<Mood> moodResponseInfo;
//
//    public AccountLocked(String n, String un, boolean r, String p) {
//        name = n;
//        username = un;
//        referWithName = r;
//        password = p;
//        //moodResponseList = new ArrayList<Mood>();
//            //add default moods into this list
//    }
//
//    @Override
//    public String getAccountType() {
//        return "locked";
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public void changeUsername(String newUsername) {
//        username = newUsername;
//    }
//
//    @Override
//    public boolean referWithName() {
//        return referWithName;
//    }
//
//    @Override
//    public void changeReferSetting(boolean newReferWithName) {
//        referWithName = newReferWithName;
//    }
//
//    @Override
//    public boolean checkPassword(String otherPass) {
//        if(password.equals(otherPass)) return true;
//        return false;
//    }
//
//    @Override
//    public ArrayList<Mood> getMoodInfo() {
//        return moodResponseInfo;
//    }
//
//    @Override
//    public void changeMoodInfo(ArrayList<Mood> newMoodInfo) {
//        moodResponseInfo = newMoodInfo;
//    }
//}
