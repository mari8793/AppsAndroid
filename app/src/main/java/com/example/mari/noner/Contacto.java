package com.example.mari.noner;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);


    }

    public void Telefono(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Telefono fragment= new Telefono();
        fragmentTransaction.replace(R.id.activity_contacto, fragment);
        fragmentTransaction.commit();
    }

    public void Ubicacion(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Ubicacion fragment= new Ubicacion();
        fragmentTransaction.replace(R.id.activity_contacto, fragment);
        fragmentTransaction.commit();
    }


    public void Correo(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Correo fragment= new Correo();
        fragmentTransaction.replace(R.id.activity_contacto, fragment);
        fragmentTransaction.commit();
    }


    public void Redes(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Redes fragment= new Redes();
        fragmentTransaction.replace(R.id.activity_contacto, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}

