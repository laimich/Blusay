package moodlistener.blusay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;

import static java.sql.DriverManager.println;

/**
 * Created by Michelle on 6/3/2017.
 */

public class Initial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial);

        //ScrollView test = (ScrollView) findViewById(R.id.settingsMainLayout);
        //test.setVisibility(View.GONE);

        //for continue as local user
        Button enterLocalUser = (Button) findViewById(R.id.initialLocalUser);
        enterLocalUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("go to main screen with local info");
            }
        });

        //for password sign up
        Button signUp = (Button) findViewById(R.id.initialMemberSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Initial.this, SignUp.class));
            }
        });

        //for password sign in
        Button signIn = (Button) findViewById(R.id.initialMemberLogIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hide the buttons for log in/sign up
                Button logInButton = (Button) findViewById(R.id.initialMemberLogIn);
                Button signUpButton = (Button) findViewById(R.id.initialMemberSignUp);
                logInButton.setVisibility(View.GONE);
                signUpButton.setVisibility(View.GONE);

                //Show text fields for logging in
                EditText passwordLogIn = (EditText) findViewById(R.id.initialPasswordLogIn);
                EditText passwordSignUp = (EditText) findViewById(R.id.initialPasswordSignUp);
                passwordLogIn.setVisibility(View.VISIBLE);
                passwordSignUp.setVisibility(View.VISIBLE);

                //Change the label for the bottom button for logging in
                Button continueButton = (Button) findViewById(R.id.initialLocalUser);
                continueButton.setText("Log in");
                continueButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        println("go to main screen with password info");
                    }
                });
            }
        });
    }
}