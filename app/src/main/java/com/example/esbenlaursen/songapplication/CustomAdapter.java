package com.example.esbenlaursen.songapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by EsbenLaursen on 23-02-2017.
 */

public class CustomAdapter extends ArrayAdapter<Song> {
    private ArrayList<Song> songs = new ArrayList<>();
    public CustomAdapter(Context context, ArrayList<Song> songs) {
        super(context, R.layout.custom_row, songs);
        this.songs = songs;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customview = inflater.inflate(R.layout.custom_row, parent, false);

        if(position % 2 == 1)
        {
            customview.setBackgroundColor(Color.GRAY);
        } else
        {
            customview.setBackgroundColor(Color.LTGRAY);
        }


        TextView txtbpm = (TextView) customview.findViewById(R.id.txtSongBPM);
        txtbpm.setTextSize(15);

        Song s = (Song) getItem(position);
        int bpm = s.getBpm();
        if(bpm > 0 && bpm <= 100)
        {
            txtbpm.setTextColor(Color.BLUE);
        } else if(bpm > 100 && bpm <= 128)
        {
            txtbpm.setTextColor(Color.GREEN);
        } else if(bpm > 128 && bpm <= 140)
        {
            txtbpm.setTextColor(Color.parseColor("#ffa500"));
        }else if(bpm > 140 && bpm <= 160)
        {
            txtbpm.setTextColor(Color.RED);
        }else if(bpm > 160)
        {
            txtbpm.setTextColor(Color.parseColor("#551a8b"));
        }


        String bpmString = "<b>Bpm: </b>" + bpm;
        txtbpm.setText(Html.fromHtml(bpmString));
        String titleString = "<b>Title: </b>" + s.getTitle();
        String yearString = "<b>Year: </b>" + + s.getYear();
        String artistString = "<b>Artist: </b>" + s.getArtist();

        TextView title = (TextView) customview.findViewById(R.id.txtSongtitle);
        TextView artist = (TextView) customview.findViewById(R.id.txtArtist);
        TextView year = (TextView) customview.findViewById(R.id.txtYear);
        ImageView image = (ImageView) customview.findViewById(R.id.imageFavorite);
        title.setText(Html.fromHtml(titleString));
        artist.setText(Html.fromHtml(artistString));
        year.setText(Html.fromHtml(yearString));
        if(s.isFavorite())
        {
            image.setImageResource(R.drawable.up);
        } else
        {
            image.setImageResource(R.drawable.down);
        }

        return customview;
    }
    @Override
    public int getCount() {
        return songs.size();
    }
}
