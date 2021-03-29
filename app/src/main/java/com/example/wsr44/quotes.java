package com.example.wsr44;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class quotes {
    private boolean success;

    private ArrayList<quote> data;

    public ArrayList<quote> getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(ArrayList<quote> data) {
        this.data = data;
    }
}
