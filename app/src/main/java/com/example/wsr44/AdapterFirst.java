package com.example.wsr44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.internal.$Gson$Preconditions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterFirst extends ArrayAdapter<quote> {
    public AdapterFirst(@NonNull Context context, int resource, ArrayList<quote> quotes) {
        super(context, resource, quotes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        quote quote = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter1, null);
        }

        ((TextView)convertView.findViewById(R.id.name)).setText(quote.getTitle());
        ((TextView)convertView.findViewById(R.id.desc)).setText(quote.getDescription());
        Picasso.get().load(quote.getImage()).into((ImageView)(convertView.findViewById(R.id.img)));


        return convertView;
    }
}
