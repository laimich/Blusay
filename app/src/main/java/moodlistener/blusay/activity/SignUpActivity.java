package moodlistener.blusay.activity;

import moodlistener.blusay.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static java.sql.DriverManager.println;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        //for showing more info
        ImageButton moreInfoButton = (ImageButton) findViewById(R.id.signUpMoreInfoButton);
        moreInfoButton.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                TextView moreInfoText = (TextView) findViewById(R.id.signUpMoreInfoText);
                if(event.getAction() == MotionEvent.ACTION_HOVER_ENTER) {
                    moreInfoText.setVisibility(View.VISIBLE);
                }
                if(event.getAction() == MotionEvent.ACTION_HOVER_EXIT) {
                    moreInfoText.setVisibility(View.INVISIBLE);
                }
                return false;
            }
        });


    }



}
