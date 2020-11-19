package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView museumsCard,churchesCard,statuesCard, historyCard,theatreCard,infoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //defining cards
        museumsCard = (CardView) findViewById(R.id.museums_card);
        churchesCard = (CardView) findViewById(R.id.churches_card);
        statuesCard = (CardView) findViewById(R.id.statues_card);
        historyCard = (CardView) findViewById(R.id.history_card);
        theatreCard = (CardView) findViewById(R.id.theatre_card);
        infoCard = (CardView) findViewById(R.id.info_card);

        //adding clock listeners to the cards
        museumsCard.setOnClickListener(this);
        churchesCard.setOnClickListener(this);
        statuesCard.setOnClickListener(this);
        historyCard.setOnClickListener(this);
        theatreCard.setOnClickListener(this);
        infoCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.museums_card : i = new Intent(this,Museums.class);startActivity(i);break;
            case R.id.churches_card : i = new Intent(this,Churches.class);startActivity(i);break;
            case R.id.statues_card : i = new Intent(this,Statues.class);startActivity(i);break;
            case R.id.history_card : i = new Intent(this,HistoricalBuildings.class);startActivity(i);break;
            case R.id.theatre_card : i = new Intent(this,Theatres.class);startActivity(i);break;
            case R.id.info_card : i = new Intent(this,Info.class);startActivity(i);break;
            default:break;
        }
    }
}
