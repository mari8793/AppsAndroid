package com.example.mari.noner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mari on 11/11/16.
 */

public class Nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosotros);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}