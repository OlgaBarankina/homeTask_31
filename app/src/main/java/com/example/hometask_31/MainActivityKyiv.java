package com.example.hometask_31;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityKyiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyiv);
        goToButtonBack();
    }

    public void goToButtonBack () {
        final Context context = this;
        Button BtnKyivBack = (Button) findViewById(R.id.btKyivBack);

        BtnKyivBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityKyiv.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}