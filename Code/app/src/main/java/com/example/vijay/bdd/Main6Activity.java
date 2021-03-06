package com.example.vijay.bdd;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    String[] titles,titles1;
    String[] Des,Des1;
    ListView list;
    int[] images = {R.drawable.lifeone, R.drawable.lifeone, R.drawable.lifeone,R.drawable.lifeone,R.drawable.lifeone,
            R.drawable.lifeone,R.drawable.lifeone,R.drawable.lifeone
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Resources res = getResources();
        titles = res.getStringArray(R.array.titles);
        Des = res.getStringArray(R.array.description);

        list = (ListView) findViewById(R.id.listVieww);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intend = new Intent(Main6Activity.this, Main24Activity.class);
                    startActivity(intend);
                }
                if(i==1)
                {
                    Intent intend = new Intent(Main6Activity.this, Main25Activity.class);
                    startActivity(intend);
                }
                if(i==2)
                {
                    Intent intend = new Intent(Main6Activity.this, Main26Activity.class);
                    startActivity(intend);
                }
                if(i==3)
                {
                    Intent intend = new Intent(Main6Activity.this, Main27Activity.class);
                    startActivity(intend);
                }
                if(i==4)
                {
                    Intent intend = new Intent(Main6Activity.this, Main28Activity.class);
                    startActivity(intend);
                }
                if(i==5)
                {
                    Intent intend = new Intent(Main6Activity.this, Main29Activity.class);
                    startActivity(intend);
                }
                if(i==6)
                {
                    Intent intend = new Intent(Main6Activity.this, Main30Activity.class);
                    startActivity(intend);
                }
                if(i==7)
                {
                    Intent intend = new Intent(Main6Activity.this, Main31Activity.class);
                    startActivity(intend);
                }

            }
        });
        HAadapter aadapter=new HAadapter(this,titles,images,Des);
        list.setAdapter(aadapter);
    }

}
class  HAadapter extends ArrayAdapter<String>
{   int[] images;
    String[] titlea;
    String[] desa;
    Context context;
    HAadapter(Context c,String[] titles,int imag[],String[] desc)
    {
        super(c,R.layout.single,R.id.textV,titles);
        this.context=c;
        this.images=imag;
        this.titlea=titles;
        this.desa=desc;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.single,parent,false);
        ImageView myimage=(ImageView) row.findViewById(R.id.imageV);
        TextView mytitle=(TextView)row.findViewById(R.id.textV1);
        TextView mydes=(TextView)row.findViewById(R.id.textV);

        myimage.setImageResource(images[position]);
        mytitle.setText(titlea[position]);
        mydes.setText(desa[position]);
        return row;
    }
}

