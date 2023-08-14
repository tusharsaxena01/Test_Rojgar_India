package com.bit.rojgarindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.bit.rojgarindia.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                finish();
            }
        });

        // after 2 seconds get focus to phone number input
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showSoftKeyboard(binding.etPhoneNo);
            }
        }, 2000);

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void showSoftKeyboard(View view) {
        if (view.requestFocus()) {
            InputMethodManager imm = getSystemService(InputMethodManager.class);
            imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
        }
    }
}