package com.kodiapps.fast.free.secure.dagger2_pactices.component;


import com.kodiapps.fast.free.secure.dagger2_pactices.module.LoginModule;
import com.kodiapps.fast.free.secure.dagger2_pactices.viewModel.LoginViewModel;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {LoginModule.class})
public interface LoginComponent {

    // Declare Objects To Use
    // LoginViewModel Object
    LoginViewModel loginViewModel();


}

