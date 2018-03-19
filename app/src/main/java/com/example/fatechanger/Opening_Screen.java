package com.example.fatechanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Opening_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening__screen);
        int i;
        try{
        this.wait(300);}
        catch(Exception e)
        {
            System.out.print("Hello");
        }
        Intent m = new Intent(this, Menu.class);
        startActivity(m);
    }
}
