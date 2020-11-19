package com.klarasapps.theguideofrijeka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModernMuseum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_museum);
    }
    public void location(View view){
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/qQceThSDMP33Yksr7"));
        startActivity(locationIntent);
    }
}
