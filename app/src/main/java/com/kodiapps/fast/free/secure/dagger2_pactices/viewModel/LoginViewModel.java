package com.kodiapps.fast.free.secure.dagger2_pactices.viewModel;

import javax.inject.Inject;

public class LoginViewModel {

    private  String userName;
    private  String passWord;

    @Inject
    public LoginViewModel() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
