package com.example.wsr44;

import java.util.ArrayList;

public class feelings {
    public  boolean success;

    private ArrayList<feeling> data;

    public ArrayList<feeling> getData() {
        return data;
    }

    public void setData(ArrayList<feeling> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
