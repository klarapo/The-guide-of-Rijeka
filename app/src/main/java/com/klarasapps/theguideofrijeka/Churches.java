package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Churches extends AppCompatActivity implements View.OnClickListener {
    private CardView jeromeCard,georgeCard,ladytrsatCard, virginmaryCard,vitusCard,capucinCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churches);
        //defining cards
        jeromeCard = (CardView) findViewById(R.id.jerome_card);
        georgeCard = (CardView) findViewById(R.id.george_card);
        ladytrsatCard = (CardView) findViewById(R.id.ladytrsat_card);
        virginmaryCard = (CardView) findViewById(R.id.virginmary_card);
        vitusCard = (CardView) findViewById(R.id.vitus_card);
        capucinCard = (CardView) findViewById(R.id.capucin_card);


        //adding clock listeners to the cards
        jeromeCard.setOnClickListener(this);
        georgeCard.setOnClickListener(this);
        ladytrsatCard.setOnClickListener(this);
        virginmaryCard.setOnClickListener(this);
        vitusCard.setOnClickListener(this);
        capucinCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.jerome_card : i = new Intent(this,Jerome.class);startActivity(i);break;
            case R.id.george_card : i = new Intent(this,George.class);startActivity(i);break;
            case R.id.ladytrsat_card : i = new Intent(this,LadyTrsat.class);startActivity(i);break;
            case R.id.virginmary_card : i = new Intent(this,VirginMary.class);startActivity(i);break;
            case R.id.vitus_card : i = new Intent(this,Vitus.class);startActivity(i);break;
            case R.id.capucin_card : i = new Intent(this,Capucin.class);startActivity(i);break;
            default:break;
        }
    }
}