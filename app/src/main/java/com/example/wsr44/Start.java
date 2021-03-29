package com.example.wsr44;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView i = (findViewById(R.id.avatar));
        Picasso.get().load(Single.getResp().getAvatar()).into(i);
        TextView t = findViewById(R.id.citata);
        t.setText("С возвращением, " + Single.getResp().getNickName());

        NetworkService.getInstance().GetApi().quotes().enqueue(new Callback<quotes>() {
            @Override
            public void onResponse(Call<quotes> call, Response<quotes> response) {
                ((TextView)findViewById(R.id.citata2)).setText(response.body().getData().get(0).getDescription());
                ListView l = findViewById(R.id.first);
                AdapterFirst a = new AdapterFirst(getApplicationContext(), R.layout.adapter1, response.body().getData());
                l.setAdapter(a);
            }

            @Override
            public void onFailure(Call<quotes> call, Throwable t) {

            }
        });
    }
}