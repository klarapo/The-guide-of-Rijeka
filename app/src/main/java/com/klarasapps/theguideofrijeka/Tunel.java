package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tunel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tunel);
    }

    public void location(View view){
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/gkThPoX7Mxx4tdUb6"));
        startActivity(locationIntent);
    }
}
