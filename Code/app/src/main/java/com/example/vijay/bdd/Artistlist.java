package com.example.vijay.bdd;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vijay on 09-04-2017.
 */

public class Artistlist extends ArrayAdapter<BDD> {

    private Activity context;
    private List<BDD> artistList;



    public Artistlist(Activity context, List<BDD> artistList){
        super(context,R.layout.list,artistList);
       this.context=context;
        this.artistList=artistList;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.list,null,true);
        TextView textViewName=(TextView)listViewItem.findViewById(R.id.textView_name);
        TextView textViewNumber=(TextView)listViewItem.findViewById(R.id.textView_blood);
        TextView textViewArrival=(TextView)listViewItem.findViewById(R.id.textView_age);
        TextView textViewFrom=(TextView)listViewItem.findViewById(R.id.textView_address);
        TextView textViewTo=(TextView)listViewItem.findViewById(R.id.textView_phone);
        TextView textViewUser=(TextView)listViewItem.findViewById(R.id.textView_user);
        TextView textViewPass=(TextView)listViewItem.findViewById(R.id.textView_pass);
        BDD artist=artistList.get(position);
        textViewName.setText(artist.getArtistname());
        textViewNumber.setText(artist.getArtistblood());
        textViewArrival.setText(artist.getArtistage());
        textViewFrom.setText(artist.getArtistaddress());
        textViewTo.setText(artist.getArtistphone());
        textViewUser.setText(artist.getArtistuser());
        textViewPass.setText(artist.getArtistpass());

        return listViewItem;
    }

}
