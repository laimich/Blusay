package moodlistener.blusay.activity;

import moodlistener.blusay.R;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewSwitcher;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        final ViewSwitcher settingSwitcher = (ViewSwitcher) findViewById(R.id.settingsMainSwitcher);
        final ViewSwitcher arrowSwitcher = (ViewSwitcher) findViewById(R.id.homeReminderArrowSwitcher);
        final ViewSwitcher contentSwitcher = (ViewSwitcher) findViewById(R.id.homeLayoutSwitcher);

        Animation slide_in_left = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation slide_out_right = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);

//        settingSwitcher.setInAnimation(slide_in_left);
//        settingSwitcher.setOutAnimation(slide_out_right);
//
//        ImageButton settingsButton = (ImageButton) findViewById(R.id.topBarSettings);
//        settingsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(settingSwitcher.getNextView() == null) {
//                    settingSwitcher.showPrevious();
//                }
//                else {
//                    settingSwitcher.showNext();
//                }
//            }
//        });

        ImageButton downReminderArrow = (ImageButton) findViewById(R.id.homeReminderDownArrow);
        downReminderArrow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowSwitcher.showNext();
                contentSwitcher.showNext();
            }
        });

        ImageButton upReminderArrow = (ImageButton) findViewById(R.id.homeReminderUpArrow);
        upReminderArrow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowSwitcher.showPrevious();
                contentSwitcher.showNext();
            }
        });

        //switcher needed for:  initial - show/hide log in stuff
        //                      mood selected - setting button (change extra limited)
        //                      initial, main menu, mood selected for light version


    }
}
