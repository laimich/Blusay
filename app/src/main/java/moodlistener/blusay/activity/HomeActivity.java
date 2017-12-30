package moodlistener.blusay.activity;

import moodlistener.blusay.R;
import moodlistener.blusay.item.Mood;
import moodlistener.blusay.item.MoodList;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Mood> moodList = new ArrayList<>();

    public ViewSwitcher arrowSwitcher;
    public ViewSwitcher contentSwitcher;
    public ImageButton settingsButton;
    public ImageButton downReminderArrow;
    public ImageButton upReminderArrow;
    public GridView gridMoodLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //for the top bar, settings
        settingsButton = (ImageButton) findViewById(R.id.topBarSomethingLeft);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSettings();
            }
        });


        //for the arrows to show/hide reminder info
        arrowSwitcher = (ViewSwitcher) findViewById(R.id.homeReminderArrowSwitcher);
        contentSwitcher = (ViewSwitcher) findViewById(R.id.homeLayoutSwitcher);

        downReminderArrow = (ImageButton) findViewById(R.id.homeReminderDownArrow);
        downReminderArrow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowSwitcher.showNext();
                contentSwitcher.showNext();
            }
        });

        upReminderArrow = (ImageButton) findViewById(R.id.homeReminderUpArrow);
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

        gridMoodLayout = (GridView) findViewById(R.id.homeMoodLayout);
        showMoods();

        gridMoodLayout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                final Mood clickedMood = (Mood) parent.getItemAtPosition(position);
//                Intent selectedMoodIntent = new Intent(getApplicationContext(), MoodSelectedActivity.class);
//                //send the clicked chat as intent
//                chatMessageIntent.putExtra("chat", clickedChat);
//                startActivity(selectedMoodIntent);
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(getApplicationContext(), MoodSelectedActivity.class));

            }
        });
    }

    public void showSettings() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_settings, null);

        builder.setView(view)
                .setTitle("Settings")
                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Dialog d = (Dialog) dialog;


                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .create().show();
    }

    public void showMoods() {
        moodList.clear();

        //for/if to iterate through db to show all moods
        //for each mood set the corresponding name/picture
        for(int test = 0; test < 10; test++) {
            moodList.add(new Mood());
        }

        MoodList adapter = new MoodList(HomeActivity.this, moodList);
        gridMoodLayout.setAdapter(adapter);
    }
}
