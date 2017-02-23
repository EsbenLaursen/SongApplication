package com.example.esbenlaursen.songapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Song> songs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddDummyData();
        ListView listView = (ListView) findViewById(R.id.listViewSongs);
        CustomAdapter customAdapter = new CustomAdapter(this, songs);
        listView.setAdapter(customAdapter);
    }

    public void AddDummyData()
    {
        Song s1 = new Song("Tænker på dig", "marvelous mosell", 120, 2010, true);
        Song s2 = new Song("Kygo", "Firestone", 50, 2012, true);
        Song s3 = new Song("Den bedste dancer", "marvelous mosell", 130, 2010, false);
        Song s4 = new Song("Fuck the system", "Showtek", 400, 2006, true);
        Song s5 = new Song("Technokim", "Trashdov", 2000, 2005, false);
        Song s6 = new Song("The shape of you", "Ed Sheeran", 65, 2015, false);
        Song s7 = new Song("Trapbar", "Allah", 2000, 2016, false);
        Song s8 = new Song("Call on me", "Starlie", 135, 2011, true);
        Song s9 = new Song("Ingen dikkedarer", "Niklas", 145, 2010, false);
        Song s10 = new Song("Fest hos mange", "Mange makers", 120, 2012, true);

        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
        songs.add(s5);
        songs.add(s6);
        songs.add(s7);
        songs.add(s8);
        songs.add(s9);
        songs.add(s10);


    }
}
