package com.example.wsr44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.squareup.picasso.Picasso;

import java.util.List;

public class adapter2 extends RecyclerView.Adapter<adapter2.ViewHolder> {

    private List<feeling> mData;
    private LayoutInflater mInflater;

    adapter2(Context context, List<feeling> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.adapter2, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.t.setText(mData.get(position).getTitle());
        Picasso.get().load(mData.get(position).getImage()).into(holder.i);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t;
        ImageView i;
        ViewHolder(View itemView) {
            super(itemView);
            t = itemView.findViewById(R.id.text_feel);
            i = itemView.findViewById(R.id.img2);
        }
    }
}