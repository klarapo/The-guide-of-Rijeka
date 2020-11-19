package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PeekPoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peek_poke);
    }

    public void location(View view){
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Zdi7HVEPKHAQ1wwM7"));
        startActivity(locationIntent);
    }
    public void gothere(View view){
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//PEEK%26POKE,+Ul.+Ivana+Grohovca+2A,+51000,+Rijeka,+Hrvatska/@45.3277569,14.4383884,18z/data=!4m16!1m6!3m5!1s0x0:0xf522ee7dc8177d52!2sPEEK%26POKE!8m2!3d45.3281458!4d14.4452883!4m8!1m0!1m5!1m1!1s0x4764a11d9d6db44f:0xf522ee7dc8177d52!2m2!1d14.4452883!2d45.3281458!3e2?hl=hr-HR"));
        startActivity(locationIntent);
    }
}
