package com.example.wsr44;

public class LoginResp {
    private String email;
    private String password;
    private String nickName;
    private String avatar;
    private String token;
    private String error;
    private boolean success = true;

    public String getToken() {
        return token;
    }
    public String getAvatar() {
        return avatar;
    }
    public String getNickName() {
        return nickName;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getError() {
        return error;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setError(String error) {
        this.error = error;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
