package com.example.wsr44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Headers;
import okhttp3.internal.http2.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ClickToLogin(View v){
        EditText em = ((EditText)findViewById(R.id.EnterLogin));
        EditText pass = ((EditText)findViewById(R.id.EnterPassword));

        String email = em.getText().toString();
        String password = pass.getText().toString();
        if(!email.equals("") && email != null) {
            if(!password.equals("") && password != null) {
                NetworkService.getInstance().GetApi().login(new LoginForm(email, password)).enqueue(new Callback<LoginResp>() {
                    @Override
                    public void onResponse(Call<LoginResp> call, Response<LoginResp> response) {
                        LoginResp resp = response.body();
                        if (resp != null) {
                            if (resp.isSuccess()) {
                                Single.setResp(resp);
                                Intent i = new Intent(getApplicationContext(), Start.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(), resp.getError(), Toast.LENGTH_LONG).show();
                            }
                        } else if (response.code() == 469) {
                            Toast.makeText(getApplicationContext(), "User with such email is not found", Toast.LENGTH_LONG).show();
                        } else if (response.code() == 470) {
                            Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(getApplicationContext(), String.valueOf(response.code()), Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResp> call, Throwable t) {
                    }
                });
            }
            else{
                Toast.makeText(getApplicationContext(), "поле password не заполнено ", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "поле email не заполнено ", Toast.LENGTH_LONG).show();
        }
    }
}