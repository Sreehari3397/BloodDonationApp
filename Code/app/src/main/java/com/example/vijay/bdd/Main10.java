package com.example.vijay.bdd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity10a);
        Button but5;
        but5=(Button)findViewById(R.id.map18);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(Main10.this, Main10a.class);

                startActivity(to);
            }
        });

    }
}
