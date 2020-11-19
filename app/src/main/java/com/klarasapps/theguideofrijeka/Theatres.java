package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Theatres extends AppCompatActivity implements View.OnClickListener {
    private CardView kalvarijaCard,puppetCard,tzajcCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatres);
        //defining cards
        kalvarijaCard = (CardView) findViewById(R.id.kalvarija_card);
        puppetCard = (CardView) findViewById(R.id.puppet_card);
        tzajcCard = (CardView) findViewById(R.id.tzajc_card);

        //adding clock listeners to the cards
        kalvarijaCard.setOnClickListener(this);
        puppetCard.setOnClickListener(this);
        tzajcCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.kalvarija_card : i = new Intent(this,RiTheatre.class);startActivity(i);break;
            case R.id.puppet_card : i = new Intent(this,Puppet.class);startActivity(i);break;
            case R.id.tzajc_card : i = new Intent(this,HNKZajc.class);startActivity(i);break;
            default:break;
        }
    }
}
