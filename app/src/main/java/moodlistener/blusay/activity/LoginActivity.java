package moodlistener.blusay.activity;

import moodlistener.blusay.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;

import static java.sql.DriverManager.println;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ScrollView test = (ScrollView) findViewById(R.id.settingsMainLayout);
        //test.setVisibility(View.GONE);

        //for continue as local user
        Button enterUnlockedUser = (Button) findViewById(R.id.loginUnlockedUser);
        enterUnlockedUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                //println("go to main screen with local info");
            }
        });

        //for password sign up
        Button signUp = (Button) findViewById(R.id.loginMemberSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
            }
        });

        //for password sign in
        Button signIn = (Button) findViewById(R.id.loginMemberLogIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hide the buttons for log in/sign up
                Button logInButton = (Button) findViewById(R.id.loginMemberLogIn);
                Button signUpButton = (Button) findViewById(R.id.loginMemberSignUp);
                logInButton.setVisibility(View.GONE);
                signUpButton.setVisibility(View.GONE);

                //Show text fields for logging in
                EditText passwordLogIn = (EditText) findViewById(R.id.loginPasswordLogIn);
                EditText passwordSignUp = (EditText) findViewById(R.id.loginPasswordSignUp);
                passwordLogIn.setVisibility(View.VISIBLE);
                passwordSignUp.setVisibility(View.VISIBLE);

                //Change the label for the bottom button for logging in
                Button continueButton = (Button) findViewById(R.id.loginUnlockedUser);
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