package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HistoricalBuildings extends AppCompatActivity implements View.OnClickListener {
    private CardView mololongoCard,oldtownCard,tunelCard, stairwellCard,astroCard,castleCard,justiceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_buildings);
        //defining cards
        mololongoCard = (CardView) findViewById(R.id.mololongo_card);
        oldtownCard = (CardView) findViewById(R.id.oldtown_card);
        tunelCard = (CardView) findViewById(R.id.tunel_card);
        stairwellCard = (CardView) findViewById(R.id.stairwell_card);
        astroCard = (CardView) findViewById(R.id.astro_card);
        castleCard = (CardView) findViewById(R.id.castle_card);
        justiceCard = (CardView) findViewById(R.id.justice_card);


        //adding clock listeners to the cards
        mololongoCard.setOnClickListener(this);
        oldtownCard.setOnClickListener(this);
        tunelCard.setOnClickListener(this);
        stairwellCard.setOnClickListener(this);
        astroCard.setOnClickListener(this);
        castleCard.setOnClickListener(this);
        justiceCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.mololongo_card : i = new Intent(this,MoloLongo.class);startActivity(i);break;
            case R.id.oldtown_card : i = new Intent(this,OldTown.class);startActivity(i);break;
            case R.id.tunel_card : i = new Intent(this,Tunel.class);startActivity(i);break;
            case R.id.stairwell_card : i = new Intent(this,Stairwell.class);startActivity(i);break;
            case R.id.astro_card : i = new Intent(this,Astro.class);startActivity(i);break;
            case R.id.castle_card : i = new Intent(this,Castle.class);startActivity(i);break;
            case R.id.justice_card : i = new Intent(this,Justice.class);startActivity(i);break;
            default:break;
        }
    }
}