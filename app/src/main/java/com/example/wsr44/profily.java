package com.example.wsr44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class profily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profily);
        ImageView i = (findViewById(R.id.img3));
        Picasso.get().load(Single.getResp().getAvatar()).into(i);
        ((TextView)findViewById(R.id.name1)).setText(Single.getResp().getNickName());
    }
    public  void Click(View w){
        Intent i = new Intent(getApplicationContext(), Login.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}