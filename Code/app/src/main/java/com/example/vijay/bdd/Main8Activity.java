package com.example.vijay.bdd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button but5,button;
        but5=(Button)findViewById(R.id.map1);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(Main8Activity.this, Main15Activity.class);

                startActivity(to);
            }
        });
        button = (Button) findViewById(R.id.bu3ton66);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                String ph="7373812345";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",ph, null)));
            }
        });

    }
}
