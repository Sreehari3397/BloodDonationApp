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

public class Main3Activity extends AppCompatActivity {
    ListView listViewArtists;
    DatabaseReference dataart;
    List<BDD> artistList;
    private Button but,but4;
    private EditText name,password,age,blood,address,phone,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        dataart= FirebaseDatabase.getInstance().getReference("SIGNUP");
        but=(Button)findViewById(R.id.button4);
        name=(EditText) findViewById(R.id.editText3);
        age=(EditText)findViewById(R.id.editText4);
        blood=(EditText)findViewById(R.id.editText5);
        address=(EditText)findViewById(R.id.editText6);
        phone=(EditText)findViewById(R.id.editText7);
        username=(EditText)findViewById(R.id.editText8);
        password=(EditText)findViewById(R.id.editText9);
        //   listViewArtists=(ListView)findViewById(R.id.listViewArtist) ;
        artistList=new ArrayList<>();
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();

             //   Intent to = new Intent(Main3Activity.this, Main5Activity.class);
               // startActivity(to);

            }
        });
        but4=(Button)findViewById(R.id.login);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(Main3Activity.this, Main2Activity.class);

                startActivity(to);
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
    private void add(){
        String names=name.getText().toString().trim();
        String bloods=blood.getText().toString().trim();
        String ages=age.getText().toString().trim();
        String addresss=address.getText().toString().trim();
        String phones=phone.getText().toString().trim();
        String usernames=username.getText().toString().trim();
        String passwords=password.getText().toString().trim();

        if(!TextUtils.isEmpty(names)){
            String id=dataart.push().getKey();
            BDD artist=new BDD(id,names,bloods,ages,addresss,phones,usernames,passwords);
            dataart.child(id).setValue(artist);
            Toast.makeText(this,"sign up success",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"sign up not success",Toast.LENGTH_LONG).show();
        }

    }
}
