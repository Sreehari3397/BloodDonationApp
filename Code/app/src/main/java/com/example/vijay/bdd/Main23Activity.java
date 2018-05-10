package com.example.vijay.bdd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main23Activity extends AppCompatActivity {
       Button but,but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        but=(Button)findViewById(R.id.butdata);
        but1=(Button)findViewById(R.id.butlist);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // add();
                Intent to = new Intent(Main23Activity.this, Main4Activity.class);
                startActivity(to);

            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // add();
                Intent to = new Intent(Main23Activity.this, Main6Activity.class);
                startActivity(to);

            }
        });
    }
}
