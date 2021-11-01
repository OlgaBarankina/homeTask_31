package com.example.hometask_31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToButtonPictures();
        goToButtonJokes();
        goToButtonOmens();
        goToButtonQuotes();
        goToButtonSeaviews();
        goToButtonEmotions();
        goToButtonAuthor();
    }


    //goToButtonPictures

        public void goToButtonPictures () {
            final Context context = this;
            Button BtnPictureSt = (Button) findViewById(R.id.btPicturesStart);

            BtnPictureSt.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MainActivityKyiv.class);
                    startActivity(intent);
                }
            });
        }

    //goToButtonJokes

    public void goToButtonJokes () {
        final Context context = this;
        Button BtnJokeSt = (Button) findViewById(R.id.btJokesStart);

        BtnJokeSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityJokes.class);
                startActivity(intent);
            }
        });
    }

    //goToButtonSeaviews

    public void goToButtonSeaviews () {
        final Context context = this;
        Button BtnSeaViewsSt = (Button) findViewById(R.id.btSeaViewsStart);

        BtnSeaViewsSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitySeaViews.class);
                startActivity(intent);
            }
        });
    }

    //goToButtonOmens

    public void goToButtonOmens () {
        final Context context = this;
        Button BtnOmensSt = (Button) findViewById(R.id.btOmenStart);

        BtnOmensSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityOmens.class);
                startActivity(intent);
            }
        });
    }

    //goToButtonQuotes

    public void goToButtonQuotes () {
        final Context context = this;
        Button BtnQuotesSt = (Button) findViewById(R.id.btQuotesStart);

        BtnQuotesSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityQuotes.class);
                startActivity(intent);
            }
        });
    }

    //goToButtonEmotions

    public void goToButtonEmotions () {
        final Context context = this;
        Button BtnEmotionsSt = (Button) findViewById(R.id.btEmotionPicsStart);

        BtnEmotionsSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityEmotions.class);
                startActivity(intent);
            }
        });
    }

    //goToButtonAuthor

    public void goToButtonAuthor () {
        final Context context = this;
        Button BtnAuthorSt = (Button) findViewById(R.id.btAboutAuthorStart);

        BtnAuthorSt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityAuthor.class);
                startActivity(intent);
            }
        });
    }

}



