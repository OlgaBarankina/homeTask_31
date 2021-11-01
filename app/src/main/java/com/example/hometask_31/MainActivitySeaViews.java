package com.example.hometask_31;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivitySeaViews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seaview);
        goToButtonBack();
    }

    public void goToButtonBack () {
        final Context context = this;
        Button BtnJokesBack = (Button) findViewById(R.id.btSeaViewBack);

        BtnJokesBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitySeaViews.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}