package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Statues extends AppCompatActivity implements View.OnClickListener {
    private CardView bridgeCard,zajcCard, mlikaricaCard,jankopkamovCard,walkerCard,liberationCard,marketCard,towerCard,romanCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statues);
        //defining cards
        bridgeCard = (CardView) findViewById(R.id.bridge_card);
        zajcCard = (CardView) findViewById(R.id.zajc_card);
        mlikaricaCard = (CardView) findViewById(R.id.mlikarica_card);
        jankopkamovCard = (CardView) findViewById(R.id.jankopkamov_card);
        walkerCard = (CardView) findViewById(R.id.walker_card);
        liberationCard = (CardView) findViewById(R.id.liberation_card);
        marketCard = (CardView) findViewById(R.id.market_card);
        towerCard = (CardView) findViewById(R.id.tower_card);
        romanCard = (CardView) findViewById(R.id.roman_card);

        //adding clock listeners to the cards
        bridgeCard.setOnClickListener(this);
        zajcCard.setOnClickListener(this);
        mlikaricaCard.setOnClickListener(this);
        jankopkamovCard.setOnClickListener(this);
        walkerCard.setOnClickListener(this);
        liberationCard.setOnClickListener(this);
        marketCard.setOnClickListener(this);
        towerCard.setOnClickListener(this);
        romanCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.bridge_card : i = new Intent(this,Bridge.class);startActivity(i);break;
            case R.id.zajc_card : i = new Intent(this,Zajc.class);startActivity(i);break;
            case R.id.mlikarica_card : i = new Intent(this,Mlikarica.class);startActivity(i);break;
            case R.id.jankopkamov_card : i = new Intent(this,JankoPKamov.class);startActivity(i);break;
            case R.id.walker_card : i = new Intent(this,Walker.class);startActivity(i);break;
            case R.id.liberation_card : i = new Intent(this,Liberation.class);startActivity(i);break;
            case R.id.market_card : i = new Intent(this,Market.class);startActivity(i);break;
            case R.id.tower_card : i = new Intent(this,Tower.class);startActivity(i);break;
            case R.id.roman_card : i = new Intent(this,Roman.class);startActivity(i);break;
            default:break;
        }
    }
}

