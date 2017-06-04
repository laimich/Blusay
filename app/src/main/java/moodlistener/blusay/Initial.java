package moodlistener.blusay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import static java.sql.DriverManager.println;

/**
 * Created by Michelle on 6/3/2017.
 */

public class Initial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial);

        Button enterLocalUser = (Button) findViewById(R.id.initialLocalUser);
        enterLocalUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("go to main screen with local info");
            }
        });

    }

    public void goToSignIn(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("go to sign in screen");
            }
        });
    }

    public void goToSignUp(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("go to sign up screen");
            }
        });
    }

    public void removeText(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText editView = (EditText) v;
                    editView.setText("");
                }
                catch (Exception e) {
                    println("exception");
                }

            }
        });
    }
}