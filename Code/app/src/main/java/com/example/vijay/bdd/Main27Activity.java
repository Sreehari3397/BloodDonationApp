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

public class Main27Activity extends AppCompatActivity {
    String[] titles,titles1;
    String[] Des,Des1;
    ListView list;
    int[] images = {R.drawable.pers, R.drawable.pers, R.drawable.pers,R.drawable.pers};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        Resources res = getResources();
        titles = res.getStringArray(R.array.titles4);
        Des = res.getStringArray(R.array.description4);

        list = (ListView) findViewById(R.id.list4);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intend = new Intent(Main27Activity.this, Main7Activity.class);
                    startActivity(intend);
                }
                if(i==1)
                {
                    Intent intend = new Intent(Main27Activity.this, Main8Activity.class);
                    startActivity(intend);
                }
                if(i==2)
                {
                    Intent intend = new Intent(Main27Activity.this, Main9Activity.class);
                    startActivity(intend);
                }
                if(i==3)
                {
                    Intent intend = new Intent(Main27Activity.this, Main10Activity.class);
                    startActivity(intend);
                }

            }
        });
        DAadapter aadapter=new DAadapter(this,titles,images,Des);
        list.setAdapter(aadapter);
    }

}
class  DAadapter extends ArrayAdapter<String>
{   int[] images;
    String[] titlea;
    String[] desa;
    Context context;
    DAadapter(Context c,String[] titles,int imag[],String[] desc)
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

