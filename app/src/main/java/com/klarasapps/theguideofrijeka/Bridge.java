package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
    }

    public void location(View view){
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/GJzhGfCcxiV8o8cR8"));
        startActivity(locationIntent);
    }
}
