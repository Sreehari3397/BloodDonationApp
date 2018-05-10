package com.example.vijay.bdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    ListView listViewArtists;
    DatabaseReference dataart;
    List<BDD> artistList;
    private Button but;
    private EditText name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        listViewArtists = (ListView) findViewById(R.id.listViewArtist);
        artistList = new ArrayList<>();

        }

         protected void onStart() {
         super.onStart();
        dataart.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                artistList.clear();

                for (DataSnapshot artistSnapshot : dataSnapshot.getChildren()) {
                    BDD artist = artistSnapshot.getValue(BDD.class);
                    artistList.add(artist);
                }
                ArrayAdapter adapter = new Artistlist(Main4Activity.this, artistList);
                listViewArtists.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
         }

}