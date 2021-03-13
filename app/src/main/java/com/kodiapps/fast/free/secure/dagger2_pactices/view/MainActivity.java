package com.kodiapps.fast.free.secure.dagger2_pactices.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.kodiapps.fast.free.secure.dagger2_pactices.R;
import com.kodiapps.fast.free.secure.dagger2_pactices.classFile.MyApplicationClass;
import com.kodiapps.fast.free.secure.dagger2_pactices.databinding.ActivityMainBinding;
import com.kodiapps.fast.free.secure.dagger2_pactices.viewModel.LoginViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginViewModel loginViewModel;


    ActivityMainBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

    loginViewModel = MyApplicationClass.component.loginViewModel();

    binding.btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            loginViewModel.setUserName("fahamin");
            loginViewModel.setPassWord("145284");

            binding.lblResult.setText("Username : " + loginViewModel.getUserName() + "\n\n" + "Password : " + loginViewModel.getPassWord());

        }
    });




    }
}