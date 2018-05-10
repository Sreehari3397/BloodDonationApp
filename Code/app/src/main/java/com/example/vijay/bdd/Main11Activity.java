package com.example.vijay.bdd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Button but5,button;
        but5=(Button)findViewById(R.id.map4);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(Main11Activity.this, Main16Activity.class);

                startActivity(to);
            }
        });
        button = (Button) findViewById(R.id.butto666);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                String ph="7373812345";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",ph, null)));
            }
        });

    }
}
