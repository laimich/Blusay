package moodlistener.blusay.item;

import moodlistener.blusay.R;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Michelle on 12/29/2017.
 */

public class MoodList extends ArrayAdapter<Mood> {
    private Activity context;
    private List<Mood> moodList;

    public MoodList(Activity context, List<Mood> moods){
        super(context, R.layout.item_mood, moods);
        this.context = context;
        this.moodList = moods;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View moodItem = inflater.inflate(R.layout.item_mood, null, true);

        //set any xml text/data here
        Mood mood = moodList.get(position);


        return moodItem;
    }
}
