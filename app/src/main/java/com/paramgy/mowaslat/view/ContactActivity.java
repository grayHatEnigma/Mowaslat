package com.paramgy.mowaslat.view;

import android.os.Bundle;
import android.view.View;

import com.paramgy.mowaslat.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void closeButtonClicked(View view) {
        onBackPressed();
    }
}
