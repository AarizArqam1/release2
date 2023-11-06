 package com.techloyce.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techloyce.sdk.Toasty;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.SimpleToast(this,"sdfa");
    }
}