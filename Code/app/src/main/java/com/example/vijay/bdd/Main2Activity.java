package com.example.vijay.bdd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.*;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

//import com.firebase.client.Firebase;

public class Main2Activity extends AppCompatActivity {
    ListView listViewArtists;
    DatabaseReference dataart;
    List<BDD> artistList;
    private Button but;
    private EditText name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dataart= FirebaseDatabase.getInstance().getReference("Login");
        but=(Button)findViewById(R.id.button3);
        name=(EditText) findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
     //   listViewArtists=(ListView)findViewById(R.id.listViewArtist) ;
        artistList=new ArrayList<>();
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String name1   =name.getText().toString();
                String name2   =password.getText().toString();


                if(name1.equals(name2))
                {
                    Intent to = new Intent(Main2Activity.this, Main23Activity.class);
                    startActivity(to);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"Invalid entry",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
 /*   @Override
    protected void onStart() {
        super.onStart();
        dataart.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                artistList.clear();

                for(DataSnapshot artistSnapshot: dataSnapshot.getChildren()){
                    BDD artist=artistSnapshot.getValue(BDD.class);
                    artistList.add(artist);
                }
                ArrayAdapter adapter=new Artistlist(Main2Activity.this,artistList);
                listViewArtists.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
*/
   /* private void add(){
        String names=name.getText().toString().trim();
        String genres=password.getText().toString().trim();

        if(!TextUtils.isEmpty(names)){
            String id=dataart.push().getKey();
            BDD artist=new BDD(id,names,genres);
            dataart.child(id).setValue(artist);
            Toast.makeText(this,"login success",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"login not success",Toast.LENGTH_LONG).show();
        }
    }*/
}
