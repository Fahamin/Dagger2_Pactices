package com.kodiapps.fast.free.secure.dagger2_pactices.module;

import com.kodiapps.fast.free.secure.dagger2_pactices.viewModel.LoginViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class LoginModule {

    @Singleton
    @Provides
    public LoginViewModel mainActivityViewModel() {
        return new LoginViewModel();
    }



}
