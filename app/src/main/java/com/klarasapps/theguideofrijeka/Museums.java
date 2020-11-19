package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Museums extends AppCompatActivity implements View.OnClickListener {
    private CardView mahisCard,papCard,cmorCard, mcaCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        //defining cards
        mahisCard = (CardView) findViewById(R.id.mahis_card);
        papCard = (CardView) findViewById(R.id.pap_card);
        cmorCard = (CardView) findViewById(R.id.cmor_card);
        mcaCard = (CardView) findViewById(R.id.mca_card);

        //adding clock listeners to the cards
        mahisCard.setOnClickListener(this);
        papCard.setOnClickListener(this);
        cmorCard.setOnClickListener(this);
        mcaCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.mahis_card : i = new Intent(this,MarinHistory.class);startActivity(i);break;
            case R.id.pap_card : i = new Intent(this,PeekPoke.class);startActivity(i);break;
            case R.id.cmor_card : i = new Intent(this,ModernMuseum.class);startActivity(i);break;
            case R.id.mca_card : i = new Intent(this,CityMuseum.class);startActivity(i);break;
            default:break;
        }
    }
}

