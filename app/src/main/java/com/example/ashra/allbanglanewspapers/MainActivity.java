package com.example.ashra.allbanglanewspapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView firstCardView,secondCardView,thirdCardView,fourthCardView,fifthCardView,sixthCardView,seventhCardView,eighthCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCardView = findViewById(R.id.firstCardViewId);
        secondCardView = findViewById(R.id.secondCardViewId);
        thirdCardView = findViewById(R.id.thirdCardViewId);
        fourthCardView = findViewById(R.id.fourthCardViewId);
        fifthCardView = findViewById(R.id.fifthCardViewId);
        sixthCardView = findViewById(R.id.sixthCardViewId);
        seventhCardView = findViewById(R.id.seventhCardViewId);
        eighthCardView = findViewById(R.id.eighthCardViewId);


        firstCardView.setOnClickListener(this);
        secondCardView.setOnClickListener(this);
        thirdCardView.setOnClickListener(this);
        fourthCardView.setOnClickListener(this);
        fifthCardView.setOnClickListener(this);
        sixthCardView.setOnClickListener(this);
        seventhCardView.setOnClickListener(this);
        eighthCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

       if(view.getId()==R.id.firstCardViewId){

           Intent intent = new Intent(MainActivity.this,firstActivity.class);
           startActivity(intent);
       }
        else if(view.getId()==R.id.secondCardViewId){

Intent intent = new Intent(MainActivity.this,secondActivity.class);
startActivity(intent);

        }

        if (view.getId()==R.id.thirdCardViewId){
            Intent intent = new Intent(MainActivity.this,thirdActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.fourthCardViewId){

            Intent intent = new Intent(MainActivity.this,fourthActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.fifthCardViewId){

            Intent intent = new Intent(MainActivity.this,fifthActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.sixthCardViewId){

            Intent intent = new Intent(MainActivity.this,sixthActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.sixthCardViewId){
            Intent intent = new Intent(MainActivity.this,seventhActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.eighthCardViewId){

            Intent intent = new Intent(MainActivity.this,eighthActivity.class);
            startActivity(intent);
        }

    }
}
