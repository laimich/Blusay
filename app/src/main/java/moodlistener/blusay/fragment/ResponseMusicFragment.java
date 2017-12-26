package moodlistener.blusay.fragment;

import moodlistener.blusay.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

import static java.sql.DriverManager.println;


public class ResponseMusicFragment extends AppCompatActivity {

    @Override @TargetApi(23)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_response_music);

        final MediaPlayer mp = new MediaPlayer();   //make static if have multi mp3 files to play
        ImageButton playPause = (ImageButton) findViewById(R.id.responseMusicPlayPause);     //this would be the button to play/stop
        TextView timestamp = (TextView) findViewById(R.id.responseMusicTimestamp);
        timestamp.setText(mp.getTimestamp().toString());

        playPause.setOnClickListener(new View.OnClickListener() {

            @Override @TargetApi(21)
            public void onClick(View v) {

                ImageButton playReplay = (ImageButton) findViewById(R.id.responseMusicPlayPause);

                if(mp.isPlaying())
                {
                    playReplay.setBackground(getDrawable(R.drawable.vector_play_circle));
                    mp.stop();
                }

                try {
                    playReplay.setBackground(getDrawable(R.drawable.vector_replay_arrow));
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("AudioFile.mp3");   //this is name of mp3 file in assets folder
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }



}
