package com.example.wsr44;

public class Single {

    private static  LoginResp resp;

    public static LoginResp getResp() {
        return resp;
    }

    public static void setResp(LoginResp resp1) {
        resp = resp1;
    }
}
